package modul_2.day_9.mySql_Java;

import java.sql.*;

public class DbUtil {
    static String DB_URL = "jdbc:mysql://localhost:3306/my_db?useSSL=true&characterEncoding=utf8&serverTimezone=UTC";
    static String DB_USER = "root";
    static String DB_PASS = "coderslab";
    private static final String DELETE_QUERY = "DELETE FROM tableName WHERE id = ?";
    private static String UPDATE_QUERY = "UPDATE tableName SET name = ?, address = ? WHERE id = ?";

    public static Connection connection(String dbName) throws SQLException {
        DB_URL = DB_URL.replaceAll("my_db", dbName);
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        return connection;
    }

    public static void insert(Connection connection, String query, String... params) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setString(i + 1, params[i]);
            }
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void printDate(Connection connection, String query, String... columnNames) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.next()) {
                for (String columnName : columnNames) {
                    System.out.print(resultSet.getString(columnName) + " | ");
                }
                System.out.println();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void remove(Connection connection, String tableName, int id) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY.replaceAll("tableName", tableName))) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static double readMinMaxAvgSumCount(Connection connection, String query, String columnName) {
        double result = 0;

        try(PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {
            while(resultSet.first()) {
                result = resultSet.getDouble(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public static void editMovie(Connection connection, String tableName, int id, String... params) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY.replaceAll("tableName", tableName))) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setString(i + 1, params[i]);
            }
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
