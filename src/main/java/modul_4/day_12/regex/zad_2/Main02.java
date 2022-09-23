package modul_4.day_12.regex.zad_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write password: ");
        String pass = scanner.nextLine();
        while (!verifyPassword(pass)) {
            System.out.print("Write password: ");
            pass = scanner.nextLine();
        }
        System.out.println("Your password meets the requirements.");
    }

    static boolean verifyPassword(String pass) {
        boolean[] result = new boolean[5];

        Pattern pattern1 = Pattern.compile(".{10,15}");
        Pattern pattern2 = Pattern.compile("[a-z]{1,}");
        Pattern pattern3 = Pattern.compile("[A-Z]{1,}");
        Pattern pattern4 = Pattern.compile("[A-Z]{1}[A-Z]{1}");
        Pattern pattern5 = Pattern.compile("[a-z]{1}[a-z]{1}");

        Matcher matcher1 = pattern1.matcher(pass);
        Matcher matcher2 = pattern2.matcher(pass);
        Matcher matcher3 = pattern3.matcher(pass);
        Matcher matcher4 = pattern4.matcher(pass);
        Matcher matcher5 = pattern5.matcher(pass);

        result[0] = matcher1.matches();
        result[1] = matcher2.find();
        result[2] = matcher3.find();
        result[3] = !matcher4.find();
        result[4] = !matcher5.find();

        System.out.println("It is 10 to 15 characters long: " + result[0]
            + "\nIt has at least one lowercase letter: " + result[1]
            + "\nIt has at least one capital letter: " + result[2]
            + "\nIt doesn't contain two uppercase in a row: " + result[3]
            + "\nIt doesn't contain two lowercase in a row: " + result[4]
            );

        for (int i = 0; i < result.length; i++) {
            if(result[i] == false) {
                return false;
            }
        }

        return true;
    }
}
