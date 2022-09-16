package modul_2.day_9.mySql_Java.zad_5;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.SQLException;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) throws SQLException {
        final String DB_NAME = "dj_cinemas";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write id movie to delete: ");
        DbUtil.remove(DbUtil.connection(DB_NAME),"movies", scanner.nextInt());
    }
}
