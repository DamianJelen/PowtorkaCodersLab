package modul_4.day_12.regex.zad_1;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "";
        while(!email.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}")) {
            System.out.print("Write your correctly email address: ");
            email = scanner.next();
        }
        System.out.println("Thanks for your email!!!");
    }
}
