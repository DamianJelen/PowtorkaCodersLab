package modul_2.day_9.mySql_Java.zad_7;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.SQLException;
import java.util.Scanner;

public class Main07 {
    private static final String DB_NAME = "dj_cinemas";
    private static final String QUERY_CINEMAS = "SELECT id, name, address FROM cinemas;";
    private static String INSERT_CINEMA = "INSERT INTO cinemas(name, address) VALUE(?, ?);";
    private static final String MENU = "---------------------------------\n" +
            "a - add new movie\n" +
            "e - edit movie by id\n" +
            "d - delete movie by id\n" +
            "x - exit\n" +
            "Write one of char: ";

    public static void main(String[] args) {
        String tmpScannerValue = "";
        Scanner scanner = new Scanner(System.in);
        printMovies();
        System.out.print(MENU);
        tmpScannerValue = scanner.next();
        while (!tmpScannerValue.toLowerCase().equals("x")) {
            switch (tmpScannerValue) {
                case "a" :
                    insertCinemaNameAddress();
                    printMovies();
                    System.out.print(MENU);
                    tmpScannerValue = scanner.next();
                    break;
                case "e" :
                    int tmpIdUpd = removeUpdateMovie();
                    String[] strArr = getCinemaNameAddress();
                    try {
                        DbUtil.editMovie(DbUtil.connection(DB_NAME), "cinemas", tmpIdUpd, strArr[0], strArr[1]);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    printMovies();
                    System.out.print(MENU);
                    tmpScannerValue = scanner.next();
                    break;
                case "d" :
                    int tmpIdDel = removeUpdateMovie();
                    try {
                        DbUtil.remove(DbUtil.connection(DB_NAME), "cinemas", tmpIdDel);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    printMovies();
                    System.out.print(MENU);
                    tmpScannerValue = scanner.next();
                    break;
                default:
                    System.out.print("Unexpected value: " + tmpScannerValue + "\n" + MENU);
                    tmpScannerValue = scanner.next();
            }
        }
        System.out.println("Bye bye!!!");
    }

    public static void printMovies() {
        try {
            DbUtil.printDate(DbUtil.connection(DB_NAME), QUERY_CINEMAS, "id", "name", "address");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static int removeUpdateMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write movie id: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Write movie id: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String[] getCinemaNameAddress() {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[2];
        System.out.print("Write new cinema name: ");
        strArr[0] = scanner.nextLine();
        System.out.print("Write new cinema address: ");
        strArr[1] = scanner.nextLine();
        return strArr;
    }

    public static void insertCinemaNameAddress() {
        String[] strArr = getCinemaNameAddress();
        try {
            DbUtil.insert(DbUtil.connection(DB_NAME), INSERT_CINEMA, strArr[0], strArr[1]);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
