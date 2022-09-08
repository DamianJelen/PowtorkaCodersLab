package modul_1.day_4.operationsOnFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zad_2 {
    public static void main(String[] args) {
        createFile("text1.txt");
    }

    public static void createFile(String fileName) {
        String directoryFile = "day_4/operationsOnFiles/Zad_2/";
        directoryFile += fileName;
        File file = new File(directoryFile);
        if(file.exists()) {
            System.out.print("Plik '" + fileName + "' już istnieje.");
        } else {
            try {
                FileWriter fileWriter = new FileWriter(directoryFile);
                System.out.println("Plik '" + fileName + "' został utworzony.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
