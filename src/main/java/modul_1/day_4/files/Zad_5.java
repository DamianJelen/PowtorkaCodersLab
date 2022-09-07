package modul_1.day_4.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad_5 {
    public static void main(String[] args) {
        sortAndShowArray(readFile("day_4/files/Zad_5/text5.txt"));
    }

    public static String[] readFile(String fileName) {
        String[] strArr = new String[1];
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                strArr[strArr.length - 1] = scanner.nextLine();
                strArr = Arrays.copyOf(strArr, strArr.length + 1);
            }
        } catch (IOException e) {
            System.out.println("Plik '" + fileName + "' nie istnieje.");
        }

        strArr = Arrays.copyOf(strArr, strArr.length - 1);
        return strArr;
    }

    public static void sortAndShowArray(String[] strArr) {
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
