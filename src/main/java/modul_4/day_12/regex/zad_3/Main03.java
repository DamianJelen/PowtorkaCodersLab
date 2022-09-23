package modul_4.day_12.regex.zad_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    private static final String REGEX = "(\\d*[\\/\\*\\+-]?)*\\d*=-?\\d*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmpStr = "";
        while (!tmpStr.toLowerCase().equals("quit")) {
            System.out.print("Write: ");
            tmpStr = scanner.nextLine();

            if(!tmpStr.toLowerCase().equals("quit")) {
                System.out.println("Check equation: " + checkEquation(tmpStr));
            }
        }
    }

    static boolean checkEquation(String equantion) {
        boolean result = false;

        equantion = equantion.replaceAll(" ", "");
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(equantion);
        result = matcher.matches();
        if (result) {
            saveEquation("operations.txt", equantion);
        }


        return result;
    }

    static void saveEquation(String fileName, String strToWrite) {
        try (FileWriter fileWriter = new FileWriter("day_12/regex/" + fileName, true)){
            fileWriter.append(strToWrite + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
