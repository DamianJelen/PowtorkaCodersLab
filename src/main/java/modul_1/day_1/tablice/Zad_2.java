package modul_1.day_1.tablice;

import java.util.Arrays;
import java.util.Random;

public class Zad_2 {
    public static void main(String[] args) {
        int[] intArr = new int[20];
        for(int i = 0; i < intArr.length; i++) {
            Random random = new Random();
            intArr[i] = random.nextInt(101);
            System.out.print(intArr[i] + ", ");
        }
        Arrays.sort(intArr);
        System.out.print("\n" + intArr[0]);
    }
}
