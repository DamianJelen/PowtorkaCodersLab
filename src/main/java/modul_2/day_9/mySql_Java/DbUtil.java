package modul_2.day_9.mySql_Java;

import java.sql.Connection;
import java.sql.DriverManager;
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
}
