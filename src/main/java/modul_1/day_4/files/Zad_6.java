package modul_1.day_4.files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Zad_6 {
    public static void main(String[] args) {
        System.out.println(countChars("day_4/files/Zad_5/text5.txt"));
        System.out.println(countWords("day_4/files/Zad_5/text5.txt"));
        System.out.println(checkFileExists());
        rewrite();
    }

    public static int countChars(String fileName) {
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

    public static int countWords(String fileName) {
        int result = 0;
        Path path = Paths.get(fileName);

        try {
            for (String line : Files.readAllLines(path)) {
                result += line.split(" ").length;
            }
        } catch (IOException e) {
            System.out.println("Nie można odczytać pliku '" + fileName + "'.");
            e.printStackTrace();
        }

        return result;
    }

    public static boolean checkFileExists() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz nazwę pliku/ścieżkę z plikiem i sprawdź czy istnieje: ");
        return Files.exists(Paths.get(scanner.nextLine()));
    }

    public static void rewrite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz nazwę pliku/ścieżkę z plikiem np. day_4/files/Zad_5/text5.txt: ");
        Path path = Paths.get(scanner.nextLine());
        if(Files.exists(path)) {
            String resultFileName = "day_4/files/Zad_6/" + String.valueOf(path.getFileName()).replaceAll(".txt", "_2.txt");
            try {
                Files.copy(path, Paths.get(resultFileName), StandardCopyOption.REPLACE_EXISTING);
                FileWriter fileWriter = new FileWriter(resultFileName, true);
                for (String line : Files.readAllLines(path)) {
                    fileWriter.append("\n").append(line);
                }
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Problem z plikiem");
                e.printStackTrace();
            }
        }
    }
}
