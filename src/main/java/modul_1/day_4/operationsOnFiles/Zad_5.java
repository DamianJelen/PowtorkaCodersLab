package modul_1.day_4.operationsOnFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zad_5 {
    public static void main(String[] args) {
        readFromFile("day_4/operationsOnFiles/Zad_4/text4.txt");
    }

    public static void readFromFile(String fileName) {
        Path path = Paths.get(fileName);
        fileName = fileName.replaceAll("d_4","d_5").replaceAll(".txt", ".html");
        File file = new File(fileName);
        if (Files.exists(path)) {
            try (Scanner scanner = new Scanner(path); FileWriter fileWriter = new FileWriter(file, false)) {
                fileWriter.append("<html>\n<body>\n");

                while (scanner.hasNextLine()) {
                    fileWriter.append("<p>").append(scanner.nextLine()).append("</p>\n");
                }

                fileWriter.append("</body>\n</html>\n");
            } catch (IOException e) {
                System.out.println("Problem z odzytaniem pliku '" + fileName + "'");
                e.printStackTrace();
            }
        }
    }
}
