package modul_1.day_1.tablice;

import java.util.Arrays;
import java.util.Random;

public class Zad_5 {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            Random random = new Random();
            intArr[i] = random.nextInt(100) + 1;
        }
        System.out.println("Oryginal array: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("Sorted array: " + Arrays.toString(intArr));
    }
}
