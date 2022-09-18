package modul_2.day_10;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        for (User user : userDao.readAllUsers()) {
            System.out.println(user.toString());
        }
    }
}
