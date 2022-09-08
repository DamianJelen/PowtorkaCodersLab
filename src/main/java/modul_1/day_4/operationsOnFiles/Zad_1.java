package modul_1.day_4.operationsOnFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad_1 {
    public static void main(String[] args) {
        createDirectory("day_4/operationsOnFiles/Zad_1");
    }

    public static void createDirectory(String directoryName) {
        Path path = Paths.get(directoryName);
        String tmpPath = "";
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(Paths.get(tmpPath + path.getName(i)).toString());
            tmpPath += path.getName(i) + "/";
            if(!Files.exists(Paths.get(tmpPath + path.getName(i)))) {
                try {
                    Files.createDirectory(Paths.get((tmpPath)));
                } catch (IOException e) {
                    System.out.println("Katalog " + tmpPath + " już istnieje");
                }
            }
        }
    }
}
