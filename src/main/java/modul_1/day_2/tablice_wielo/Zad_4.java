package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

public class Zad_4 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimension(5);

        createArrays.showArraysTwoDimension(intArr);
        System.out.println("Suma przekątnej macierzy: " + createArrays.sumMatrixTraceArrays(intArr));
    }
}
