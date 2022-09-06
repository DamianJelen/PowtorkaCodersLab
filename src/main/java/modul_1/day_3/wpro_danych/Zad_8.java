package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_8 {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        int dl = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta (liczba całkowita): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Podaj wysokość trójkąta (liczba całkowita): ");
            scanner.next();
        }
        dl = scanner.nextInt();

        for (int i = 0; i < dl; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
