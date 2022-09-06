package modul_1.day_3.wpro_danych;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad_9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray()));
    }

    public static int[] sortedArray() {
        int[] resultArr;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy (liczba całkowita): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Podaj wielkość tablicy (liczba całkowita): ");
            scanner.next();
        }
        resultArr = new int[scanner.nextInt()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = random.nextInt(101);
        }

        Arrays.sort(resultArr);
        return resultArr;
    }
}
