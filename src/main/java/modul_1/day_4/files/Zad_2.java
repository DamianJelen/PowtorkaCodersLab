package modul_1.day_4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        readFile("day_4/files/Zad_1/text1.txt");
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanFile = new Scanner(file);
            StringBuilder stringBuilder = new StringBuilder();
            while (scanFile.hasNextLine()) {
                stringBuilder.append(scanFile.nextLine() + "\n");
            }
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Nie można znaleźć pliku " + fileName);
        }
    }
}
