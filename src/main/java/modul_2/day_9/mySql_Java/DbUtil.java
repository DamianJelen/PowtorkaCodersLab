package modul_2.day_9.mySql_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtil {
    static String DB_URL = "jdbc:mysql://localhost:3306/my_db?useSSL=true&characterEncoding=utf8&serverTimezone=UTC";
    static String DB_USER = "root";
    static String DB_PASS = "coderslab";

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
}
