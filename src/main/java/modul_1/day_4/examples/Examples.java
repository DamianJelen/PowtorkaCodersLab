package modul_1.day_4.examples;

import java.io.*;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        writeToFile_2("file1.txt");
        readFile("file1.txt");
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
}
