package modul_4.day_12.collections.zad_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String tmpStr = "";
        int count = 0;

        while (!tmpStr.toLowerCase().equals("exit")) {
            count++;
            System.out.print("Write " + count + " word: ");
            tmpStr = scanner.next();
            stringSet.add(tmpStr);
        }

        System.out.println("Podanych napisów: " + --count + ",\nRozmiar kolekcji: " + stringSet.size() + "\nBye bye!!!");
    }
}
