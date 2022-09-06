package modul_1.day_4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        writeToFile("day_4/files/Zad_1/text1.txt");
    }

    public static StringBuilder prepareTextToFile() {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String tmpStr = "";
        System.out.print("Wpisz kolejną linijkę tekstu: ");
        tmpStr = scanner.nextLine();
        while (!tmpStr.equals("quit")) {
            System.out.print("Wpisz kolejną linijkę tekstu: ");
            result.append(tmpStr).append("\n");
            tmpStr = scanner.nextLine();
        }

        return result;
    }

    public static void writeToFile(String fileName) {
        int lastInd = fileName.lastIndexOf("/");
        if (lastInd >= 1) {
            File dirs = new File(fileName.substring(0, lastInd));
            dirs.mkdirs();
        }

        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.append(prepareTextToFile());
        } catch (IOException e) {
            System.out.println("Problem z plikiem " + fileName);
        }
    }
}
