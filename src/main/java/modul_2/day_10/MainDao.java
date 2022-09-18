package modul_2.day_10;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.readUser(1).toString());
        System.out.println(userDao.readUser(2).toString());
        System.out.println(userDao.readUser(4).toString());
    }
}
