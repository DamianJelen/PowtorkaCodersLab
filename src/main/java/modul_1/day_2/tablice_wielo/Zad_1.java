package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

import java.util.Arrays;

public class Zad_1 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArray = createArrays.createArraysTwoDimension(3, 5);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(Arrays.toString(intArray[i]));
        }
        System.out.println("----------------------------------------");
        System.out.println(intArray[1][2] + ", " + intArray[1].length + ", " + intArray[2][3]);
    }
}
