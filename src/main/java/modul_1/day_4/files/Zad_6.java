package modul_1.day_4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad_6 {
    public static void main(String[] args) {
        System.out.println(count("day_4/files/Zad_5/text5.txt"));
    }

    public static int count(String fileName) {
        int result = 0;
        Path path = Paths.get(fileName);
        try {
            for (String line : Files.readAllLines(path)) {
                result += line.length();
            }
        } catch (IOException e) {
            System.out.println("Nie można odczytać pliku '" + fileName + "'.");
            e.printStackTrace();
        }

        return result;
    }
}
