package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

public class Zad_3 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimensionRandomSecLength(5);

        createArrays.showArraysTwoDimension(intArr);
        System.out.print("Suma wszystkich elementów: " + createArrays.sumElemArraysTwoDimension(intArr));
    }
}
