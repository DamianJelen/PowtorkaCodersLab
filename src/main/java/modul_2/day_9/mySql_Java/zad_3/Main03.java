package modul_2.day_9.mySql_Java.zad_3;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        String cinemaName = "";
        String cinemaAddress = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write cinema name: ");
        cinemaName = scanner.nextLine();
        System.out.print("Write cinema address: ");
        cinemaAddress = scanner.nextLine();

        addCinema(cinemaName, cinemaAddress);

        System.out.println("Dodano do tabeli cinemas");
    }

    static void addCinema(String name, String address) {
        final String DB_NAME = "dj_cinemas";
        String insertQuery = "INSERT INTO cinemas(name, address) VALUE (?, ?);";

        try {
            DbUtil.insert(DbUtil.connection(DB_NAME), insertQuery, name, address);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
