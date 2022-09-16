package modul_2.day_9.mySql_Java.zad_4;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.SQLException;

public class Main04 {
    public static void main(String[] args) {
        final String DB_NAME = "dj_cinemas";
        String query = "SELECT * FROM movies;";

        try {
            DbUtil.printDate(DbUtil.connection(DB_NAME), query, "title", "rating");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
