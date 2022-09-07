package modul_1.day_4.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad__4 {
    public static void main(String[] args) {
        readFile("day_4/files/Zad_4/text4.txt");
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        String tmpStrLine = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                tmpStrLine = scanner.nextLine();
                if (findWordInLine(tmpStrLine, "java")) {
                    System.out.println(tmpStrLine);
                }
            }
        } catch (IOException e) {
            System.out.println("Plik '" + fileName + "' w podanej lokalizacji nie istnieje");
        }
    }

    public static boolean findWordInLine(String line, String word) {
        line = line.toLowerCase();
        word = word.toLowerCase();
        String[] wordArrFromLine = line.split(" ");
        for (int i = 0; i < wordArrFromLine.length; i++) {
            if(wordArrFromLine[i].length() >= word.length() && wordArrFromLine[i].substring(0, word.length()).equals(word)) {
                return true;
            }
        }
        return false;
    }
}
