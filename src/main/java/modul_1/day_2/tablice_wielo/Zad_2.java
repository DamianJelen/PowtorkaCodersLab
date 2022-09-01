package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

public class Zad_2 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimensionRandomSecLength(5);

        System.out.println("Długości tablic:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println((i + 1) + ": " + intArr[i].length);
        }

        createArrays.showArraysTwoDimension(intArr);
    }
}
