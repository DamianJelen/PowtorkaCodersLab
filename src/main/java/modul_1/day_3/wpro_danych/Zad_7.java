package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_7 {
    public static void main(String[] args) {
        nettoBrutto();
    }

    public static void nettoBrutto() {
        Scanner scanner = new Scanner(System.in);
        double result = 0d;

        System.out.println("Przelicz brutto -> netto, wpisz 'bn'\nPrzelicz netto -> brutto, wpisz 'nb'");
        String tmpStr = scanner.next();
        while(!tmpStr.matches("bn|nb")) {
            System.out.print("Wprowadź 'bn' lub 'nb': ");
            tmpStr = scanner.next();
        }

        System.out.print("Wprowadź kwotę do przeliczenia: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Wprowadź kwotę do przeliczenia: ");
            scanner.next();
        }
        result = scanner.nextDouble();

        if (tmpStr.equals("nb")) {
            System.out.println("Kwota brutto: " + (result * 1.19));
        } else if (tmpStr.equals("bn")) {
            System.out.println("Kwota netto: " + (result - (result * 0.19)));
        }

    }
}
