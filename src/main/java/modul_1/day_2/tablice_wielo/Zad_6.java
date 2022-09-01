package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

import java.util.Arrays;

public class Zad_6 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimension(5);
        createArrays.showArraysTwoDimension(intArr);
        System.out.println("----------------------------------------");
        createArrays.showArrayOneDimension(minimum(intArr));
    }

    public static int[] minimum(int[][] arr) {
        int[] result = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length > 0) {
                Arrays.sort(arr[i]);
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = arr[i][0];
            }
        }
        return result;
    }
}
