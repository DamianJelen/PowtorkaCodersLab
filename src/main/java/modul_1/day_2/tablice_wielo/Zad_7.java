package modul_1.day_2.tablice_wielo;

import modul_1.day_2.examples.CreateArrays;

public class Zad_7 {
    public static void main(String[] args) {
        CreateArrays createArrays = new CreateArrays();
        int[][] intArr = createArrays.createArraysTwoDimension(5);
        int[] result = lessMore(intArr);
        createArrays.showArraysTwoDimension(intArr);
        System.out.println("ilość elementów mniejszych od średniej: " + result[0]);
        System.out.println("ilość elementów większych od średniej: " + result[1]);
    }

    public static int[] lessMore(int[][] arr) {
        int[] result = new int[2];
        int srednia = 0;
        CreateArrays createArrays = new CreateArrays();
        srednia = createArrays.sumElemArraysTwoDimension(arr) / createArrays.countArraysElem(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i].length > 0) {
                    result[0] += arr[i][j] < srednia ? 1 : 0;
                    result[1] += arr[i][j] > srednia ? 1 : 0;
                }
            }
        }
        return result;
    }
}
