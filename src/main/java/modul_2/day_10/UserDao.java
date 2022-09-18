package modul_2.day_10;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.util.Scanner;

public class UserDao {
    private static String CREATE_USER_QUERY = "INSERT INTO users(email, username, def_1) VALUE (?, ?, ?);";
    private static final String READ_USER_QUERY = "SELECT * FROM users WHERE id = ?;";
    private static final String READ_ALL_USERS_QUERY = "SELECT * FROM users;";
    private static final String UPDATE_USER_QUERY = "UPDATE users\n" +
                                                    "SET email = ?, username = ?, def_1 = ?\n" +
                                                    "WHERE id = ?;";
    private static final String DELETE_USER_QUERY = "DELETE FROM users\n" +
                                                    "WHERE id = ?;";

    public User createUser(User user) {
        try (Connection connection = DbConn.connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, hashPw(user.getDef_1()));
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            resultSet.close();
            preparedStatement.close();
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    private static String hashPw(String str) {
        return BCrypt.hashpw(str, BCrypt.gensalt());
    }

    public User readUser(int userId) {
        User user = new User();

        try (PreparedStatement preparedStatement = DbConn.connection().prepareStatement(READ_USER_QUERY)) {
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setDef_1(resultSet.getString("def_1"));
            }
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user;
    }

    public void updateUser(User user) {
        int userId = user.getId();
        try (PreparedStatement preparedStatement = DbConn.connection().prepareStatement(UPDATE_USER_QUERY)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, readUser(userId).getDef_1());
            preparedStatement.setInt(4, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("User whith id = " + userId + " has been modified.");
    }

    public void deleteUser(int userId) {
        try (PreparedStatement preparedStatement = DbConn.connection().prepareStatement(DELETE_USER_QUERY)) {
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("User has been deleted.");
    }
}
