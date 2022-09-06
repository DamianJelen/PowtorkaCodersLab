package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {
        getData();
    }

    public static void getData() {
        String resultStr = "";
        double resultSum = 0d;
        double tmpResult = 1d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby do dodania, a jak chcesz wszystko zsumowac wpisz 0.");

        while (tmpResult != 0d) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Wprowadź liczbę!!!");
                scanner.next();
            }
            tmpResult = scanner.nextDouble();
            resultStr += tmpResult + " + ";
            resultSum += tmpResult;
        }
        System.out.println(resultStr.substring(0, resultStr.length() - 8) + "= " + resultSum);
    }
}
