package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        imieWiek();
    }
    
    protected static void imieWiek() {
        Scanner scanner = new Scanner(System.in);
        String imie;
        int wiek = 0;
        System.out.print("Podaj swoje imię: ");
        imie = scanner.next();

        while(!imie.matches("[A-Z][a-z]{1,}") && !imie.isEmpty()){
            System.out.println("Podaj imie: ");
            imie = scanner.next();
        }
        System.out.print("Podaj swój wiek: ");
        while(!scanner.hasNextInt()) {
            System.out.print("Wpisz poprawny swój wiek.");
            scanner.next();
        }
        wiek = scanner.nextInt();
        System.out.println("Imie: " + imie + " wiek: " + wiek);
    }
}
