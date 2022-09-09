package modul_1.day_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TaskManager {
    public static void main(String[] args) {
        showOptions();
    }

    public static void showOptions() {
        String[] taskArr = {"add", "delete", "list", "exit"};
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        for (int i = 0; i < taskArr.length; i++) {
            System.out.println(ConsoleColors.WHITE + taskArr[i]);
        }
    }

    public static String[][] loadDataFromCsv(String fileName) {
        String[][] strArr = new String[1][1];
        int i = 0;
        Path path = Paths.get(fileName);
        try {
            for (String line : Files.readAllLines(path)) {
                int lengthSplitArr = line.split(", ").length;
                strArr[i] = Arrays.copyOf(line.split(", "), lengthSplitArr);
                strArr = Arrays.copyOf(strArr, strArr.length + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return strArr;
    }
}