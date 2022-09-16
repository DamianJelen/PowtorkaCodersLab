package modul_2.day_9.mySql_Java.zad_2;

import modul_2.day_9.mySql_Java.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main02 {
    public static void main(String[] args) {
        final String DB_NAME = "dj_products";
        String insertCategories = "INSERT INTO categories(name) VALUE (?);";
        String insertCategoriesSub = "INSERT INTO categories_sub(main_id, name) VALUE (?, ?);";

        try (Connection conn = DbUtil.connection(DB_NAME)) {
            DbUtil.insert(conn, insertCategories, "Samochody");
            DbUtil.insert(conn, insertCategories, "Komputery");
            DbUtil.insert(conn, insertCategoriesSub,"1", "Alfa romeo");
            DbUtil.insert(conn, insertCategoriesSub,"1", "Abarth");
            DbUtil.insert(conn, insertCategoriesSub,"2", "Monitory");
            DbUtil.insert(conn, insertCategoriesSub,"2", "Klawiatury");
            DbUtil.insert(conn, insertCategoriesSub,"1", "Acura");
            DbUtil.insert(conn, insertCategoriesSub,"2", "Myszki");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
