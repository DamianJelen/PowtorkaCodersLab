package modul_4.day_12.collections.zad_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> stringMap = getMap();
        int count = 0;

        System.out.println("Wpisz przeciwieństwo do podanego słowa:");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            if(entry.getValue().equals(scanner.next())) {
                count++;
            }
        }
        System.out.println("\nPoprawnych odpowiedzi: " + count);
    }

    public static Map<String, String> getMap() {
        Map<String, String> resultMap = new HashMap<>();
            resultMap.put("ciepło", "zimno");
            resultMap.put("woda","ogień");
            resultMap.put("czarny", "biały");
            resultMap.put("mokro", "sucho");
            resultMap.put("lewo", "prawo");
        return resultMap;
    }
}
