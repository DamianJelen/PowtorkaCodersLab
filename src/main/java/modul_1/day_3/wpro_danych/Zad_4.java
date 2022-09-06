package modul_1.day_3.wpro_danych;

import java.util.Arrays;
import java.util.Scanner;

public class Zad_4 {
    public static void main(String[] args) {
        rowsColumns();
    }

    public static void rowsColumns() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.print("Wprowadz liczbe całkowitą a = ");
        while (!scanner.hasNextInt()) {
            System.out.print("Wprowdz liczbę całkowitą a = ");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.print("Wprowdz liczbę całkowitą b = ");
        while (!scanner.hasNextInt()) {
            System.out.print("Wprowdz liczbę całkowitą b = ");
            scanner.next();
        }
        b = scanner.nextInt();

        createMultiArray(a, b);
    }

    public static void createMultiArray(int rows, int cols) {
        int wartosc = 0;
        int[][] intArr = new int[rows][cols];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = wartosc++;
            }
        }

        showArray(intArr);
        System.out.println("Suma elementów: " + sumArrayElem(intArr));
        System.out.println("Srednia elementów: " + avgArrayElem(intArr));
    }

    public static int sumArrayElem(int[][] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                result += intArray[i][j];
            }
        }
        return result;
    }

    public static double avgArrayElem(int[][] intArray) {
        double res = intArray.length * intArray[0].length;
        return sumArrayElem(intArray) / res;
    }

    public static void showArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(Arrays.toString(intArray[i]));
        }
    }
}
