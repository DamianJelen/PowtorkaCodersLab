package modul_2.day_9.mySql_Java.zad_6;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main06 {
    public static void main(String[] args) {
        final String DB_NAME = "dj_cinemas";
        double avgRating = 0;
        String avgQuery = "SELECT AVG(rating) FROM movies;";
        String printMovies = "SELECT title, rating FROM movies WHERE rating > ?;";

        try (PreparedStatement preparedStatement =  DbUtil.connection(DB_NAME).prepareStatement(printMovies);
            PreparedStatement statement = DbUtil.connection(DB_NAME).prepareStatement(avgQuery)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                avgRating = rs.getDouble(1);
                System.out.println("Avg movie rating: " + avgRating);
            }
            preparedStatement.setDouble(1, avgRating);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("title") + " " + resultSet.getDouble("rating"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
