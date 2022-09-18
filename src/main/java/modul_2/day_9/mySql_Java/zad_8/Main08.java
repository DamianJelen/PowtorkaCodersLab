package modul_2.day_9.mySql_Java.zad_8;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main08 {
    private static String QUERY = "SELECT m.title, m.description, m.rating\n" +
            "FROM movies m\n" +
            "WHERE LOWER(m.title) LIKE ?;";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write fullt title or phrase: ");

        try {
            showFilmByTitle(DbUtil.connection("dj_cinemas"), QUERY, scanner.nextLine());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void showFilmByTitle(Connection connection, String query, String param) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, param);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println("Title: " + resultSet.getString("title") +
                        "\nDescription: " + resultSet.getString("description") +
                        "\nRating: " + resultSet.getDouble("rating"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
