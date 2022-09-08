package modul_1.day_4.operationsOnFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad_4 {
    public static void main(String[] args) {
        Zad_1.createDirectory("day_4/operationsOnFiles/Zad_4");
        writeToFile("day_4/operationsOnFiles/Zad_4/text4.txt");
    }

    public static void writeToFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            textToFile(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void textToFile(FileWriter writer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst, jak będziesz chciał zakończyć wpisz w ostatniej lini 'quit'");
        String tmpStr = "";

        while (!tmpStr.equals("quit")) {
            tmpStr = scanner.nextLine();
            if (!tmpStr.equals("quit")) {
                writer.append(tmpStr).append("\n");
            }
        }
    }

}
