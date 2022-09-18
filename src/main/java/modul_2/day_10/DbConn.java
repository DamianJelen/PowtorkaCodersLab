package modul_2.day_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
    private static final String DB_HOST = "jdbc:mysql://localhost:3306/dj_workshop?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    protected static Connection connection() throws SQLException {
        return DriverManager.getConnection(DB_HOST, DB_USER, DB_PASS);
    }
}
