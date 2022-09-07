package modul_1.day_4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {
        readFile("day_4/files/Zad_3/text3.txt");
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        String tmpStr = "";
        double sum = 0d;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                tmpStr = scanner.nextLine();
                System.out.println(tmpStr);
                sum += calculate(tmpStr.split(","));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie można znaleść " + fileName);
        }
        sum = Math.round(sum * 100);
        System.out.println("Suma liczb: " + (sum / 100));
    }

    public static double calculate(String[] strArr) {
        double result = 0d;

        for (int i = 0; i < strArr.length; i++) {
            try {
                result += Double.valueOf(strArr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Tekst '" + strArr[i] + "' nie jest liczbą!!!");
            }
        }

        return result;
    }


}
