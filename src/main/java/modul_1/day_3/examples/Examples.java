package modul_1.day_3.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        podajLiczCalkowita_2();
//        testScanner();
    }

    public static void podajLiczCalkowita() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");

        try {
            int num = scanner.nextInt();
            System.out.println("Wprowadzono: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzono nie poprawną wartość!!!");
            e.printStackTrace();
        }
    }

    public static void podajLiczCalkowita_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Wprowadzona wartość nie jest liczbą całkowitą, wprowadź nową wartość: ");
        }
        int num = scanner.nextInt();
        System.out.println("Wprowadzono: " + num);
    }

    public static void testScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("scanner.hasNextInt" + scanner.hasNextInt());
        System.out.println("scanner.next" + scanner.next());
        System.out.println("scanner.hasNextInt" + scanner.hasNextInt());
        System.out.println("scanner.nextInt" + scanner.nextInt());
        System.out.println("scanner.hasNextInt" + scanner.hasNextInt());
    }
}
