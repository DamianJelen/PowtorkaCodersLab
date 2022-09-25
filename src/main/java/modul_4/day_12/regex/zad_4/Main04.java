package modul_4.day_12.regex.zad_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main04 {
    public static void main(String[] args) {
        boolean tmpBoolean = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your login: ");
        tmpBoolean = verifyLogin(scanner.nextLine());
        while(!tmpBoolean) {
            System.out.println("Result: " + tmpBoolean);
            System.out.print("Write your login: ");
            tmpBoolean = verifyLogin(scanner.nextLine());
        }
    }

    static boolean verifyLogin(String login) {
        boolean result[] = new boolean[2];

        String reg1 = "[a-zA-Z0-9\\-\\_]{5,}";
        String reg2 = "^([^0-9]).+";

        Pattern pattern1 = Pattern.compile(reg1);
        Pattern pattern2 = Pattern.compile(reg2);
        Matcher matcher1 = pattern1.matcher(login);
        Matcher matcher2 = pattern2.matcher(login);

        result[0] = matcher1.matches();
        result[1] = matcher2.matches();

        return result[0] && result[1];
    }
}
