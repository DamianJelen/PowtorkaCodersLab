package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_6 {
    public static void main(String[] args) {
        equation();
    }

    public static void equation() {
        int[] intArr = new int[3];
        int j = 0;
        Scanner scanner = new Scanner(System.in);

        for (char i = 'a'; i <= 'c' ; i++) {
            System.out.print("Wprowadź liczbę całkowitą dla " + i + " = ");
            while(!scanner.hasNextInt()) {
                System.out.print("Podaj wartość dla " + i + " = ");
                scanner.next();
            }
            intArr[j] = scanner.nextInt();
            j++;
        }

        double sqrtDelta = Math.sqrt(Math.pow(intArr[1], 2) - (4 * intArr[0] * intArr[2]));
        if (intArr[1] == 0) {
            System.out.println("Brak pierwiastków");
        } else if (sqrtDelta == 0) {
            System.out.println("x0 = " + (- intArr[1] / 2 * intArr[0]));
        } else {
            System.out.println("x1 = " + ((- intArr[1] + sqrtDelta)/ 2 * intArr[0]) + "\nx2 = " + ((- intArr[1] - sqrtDelta) / 2 * intArr[0]));
        }
    }
}
