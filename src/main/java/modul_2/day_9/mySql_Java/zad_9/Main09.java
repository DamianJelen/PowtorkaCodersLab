package modul_2.day_9.mySql_Java.zad_9;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main09 {
    private static final String DB_NAME = "dj_cinemas";
    private static final String QUERY = "SELECT\n" +
            "    c.id cinema_id,\n" +
            "    m.id movie_id\n" +
            "FROM\n" +
            "    cinemas c INNER JOIN cinemas_movies cm ON c.id = cm.cinema_id\n" +
            "        INNER JOIN movies m ON cm.movie_id = m.id\n" +
            "WHERE c.id = ?;";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write cinema id: ");

        try {
            showMoviesIdForCinema(DbUtil.connection(DB_NAME), QUERY, scanner.nextInt());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void showMoviesIdForCinema(Connection connection, String query, int cinemaId) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, cinemaId);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Cinema with id: " + cinemaId);
            while (resultSet.next()) {
                System.out.println("* Film about id: " + resultSet.getInt("movie_id"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
