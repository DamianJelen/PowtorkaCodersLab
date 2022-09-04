package modul_1.day_2.napisy;

import java.util.Arrays;

public class Zad_5 {
    public static void main(String[] args) {
        String[] strArr = {"Ala", " ", "ma", " ", "kota"};
        System.out.println(stringFromArray(strArr));
    }

    public static String stringFromArray(String[] strArr) {
        String result = "";
        for (int i = 0; i < strArr.length; i++) {
            result += strArr[i];
        }
        return result;
    }
}
