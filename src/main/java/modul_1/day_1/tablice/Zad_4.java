package modul_1.day_1.tablice;

import java.util.Arrays;

public class Zad_4 {
    public static void main(String[] args) {
        int[] intArr = {3, 5, 7, 2, 1};
        int[] intArrReverse = new int[5];
        for(int i = intArr.length - 1; i >= 0; i--) {
            intArrReverse[4 - i] = intArr[i];
        }
        System.out.println("Oyginal array: " + Arrays.toString(intArr) + "\nReverse array: " + Arrays.toString(intArrReverse));
    }
}
