package modul_1.day_4.operationsOnFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Zad_3 {
    public static void main(String[] args) {
        Zad_1.createDirectory("day_4/operationsOnFiles/Zad_3");
        copyFile("day_4/operationsOnFiles/Zad_3/", "text1.txt", "copyText1Zad_2.txt");
    }

    public static void copyFile(String directory, String fileName, String secondFileName) {
        Path path = Paths.get((directory.replaceAll("3", "2") + fileName));
        Path path2 = Paths.get((directory + secondFileName));
        try {
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Skopiowano");
        } catch (IOException e) {
            System.out.println("Plik '" + secondFileName + "' już isnieje");
            e.printStackTrace();
        }
    }
}
