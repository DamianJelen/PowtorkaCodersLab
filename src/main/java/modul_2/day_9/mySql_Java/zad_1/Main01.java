package modul_2.day_9.mySql_Java.zad_1;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {
    public static void main(String[] args) {
        String db_name = "dj_products";
        try(Connection conn = DbUtil.connection(db_name)) {
            System.out.println("Połączono z bazą " + db_name +".");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
