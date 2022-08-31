package modul_1.day_1.tablice;

import java.util.Arrays;

public class Zad_7 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3};
        System.out.println(Arrays.toString(append(intArr)));
    }

    protected static int[] append(int[] intArr) {
        int[] tmpIntArr = Arrays.copyOf(intArr, intArr.length * 2);
        for (int i = tmpIntArr.length / 2 - 1; i >= 0; i--) {
            tmpIntArr[tmpIntArr.length - 1 - i] = tmpIntArr[i];
        }
        return tmpIntArr;
    }
}
