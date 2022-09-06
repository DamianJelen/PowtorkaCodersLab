package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        operations();
    }

    public static void operations() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.print("Podaj liczbę a = ");
        while (!scanner.hasNextInt()) {
            System.out.print("Wprowadź liczbę całkowitą!!!");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.print("Podaj liczbę b = ");
        while (!scanner.hasNextInt()) {
            System.out.print("Wprowadź liczbę całkowitą!!!");
            scanner.next();
        }
        b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + dodawanie(a,b));
        System.out.println(a + " - " + b + " = " + odejmowanie(a,b));
        System.out.println(a + " * " + b + " = " + mnozenie(a,b));
        System.out.println(a + " / " + b + " = " + dzielenie(a,b));
    }

    private static int dodawanie(int a, int b) {
        return a + b;
    }

    private static int odejmowanie(int a, int b) {
        return a - b;
    }

    private static int mnozenie(int a, int b) {
        return a * b;
    }

    private static double dzielenie (int a, double b) {
        return a / b;
    }
}
