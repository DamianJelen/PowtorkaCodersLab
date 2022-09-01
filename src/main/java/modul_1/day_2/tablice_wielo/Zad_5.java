package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

public class Zad_5 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimensionRandomSecLength(4);
        createArrays.showArraysTwoDimension(intArr);
        System.out.println("Suma liczb nieparzystych: " + oddSum(intArr));
    }

    public static int oddSum(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j] % 2 == 0 ? 0 : arr[i][j];
            }
        }
        return result;
    }
}
