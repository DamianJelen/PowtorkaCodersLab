package modul_1.day_4.examples;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
//        writeToFile_2("file1.txt");
//        readFile("file1.txt");
//        examplePath("day_4/files/Zad_5/text5.txt");
//        readAllFile("day_4/files/Zad_4/text4.txt");
        writeToFileByPath("day_4/examples/path1.txt");
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Plik nie istnieje");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void writeToFile(String fileName){
        try (PrintWriter printWriter = new PrintWriter(fileName)){
            printWriter.println("Pierwsza linia jaka zostanie zapisana");
            printWriter.println("Druga linia jaka zostanie zapisana");
            printWriter.println("Trzecia linia jaka zostanie zapisana");
        } catch (FileNotFoundException e) {
            System.out.println("Błąd zapisu do pliku");
        }
    }

    public static void writeToFile_2(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)){
            fileWriter.append("Pierwsza linia jaka zostanie zapisana\n");
            fileWriter.append("Druga linia jaka zostanie zapisana\n");
            fileWriter.append("Trzecia linia jaka zostanie zapisana\n");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
        }
    }

    public static void examplePath(String dirFile) {
        System.out.println(dirFile);
        Path path = Paths.get(dirFile);
        System.out.println("Nazwa pliku: " + path.getFileName());
        System.out.println("Określony element ścieżki: " + path.getName(2));
        System.out.println("Liczba elementów w ścieżce: " + path.getNameCount());
        System.out.println("Ścieżka do rodzica: " + path.getParent());
        System.out.println("Katalog główny: " + path.getRoot());
        System.out.println("Czy plik istnieje: " + Files.exists(path));
        System.out.println("Czy ścieżka jest linkiem symbolicznym: " + Files.isSymbolicLink(path));
    }

    public static void readAllFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            for (String line: Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Plik '" + fileName + "' nie istnieje");
            e.printStackTrace();
        }
    }

    public static void writeToFileByPath(String newFile) {
        Path path = Paths.get(newFile);
        List<String> outList = new ArrayList<>();
        outList.add("Pierwsza linia");
        outList.add("Druga linia");
        outList.add("Trzecia linia");
        outList.add("...");
        try {
            Files.write(path, outList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Nie można zapisać pliku");
            e.printStackTrace();
        }
    }
}
