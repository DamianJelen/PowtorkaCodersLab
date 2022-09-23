package modul_4.day_12.collections.zad_7;

import java.util.*;

public class GenerateRandom {
    public static Map<Integer, Integer> checkRand(int amount, int interwal) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= interwal; i++) {
            result.put(i, 0);
        }

        Random random = new Random();
        for (int i = 1; i <= amount; i++) {
            int randomKey = random.nextInt(interwal) + 1;
            if(checkKey(result.keySet(), randomKey)) {
                int tmpInt = result.get(randomKey);
                result.remove(randomKey);
                result.put(randomKey, ++tmpInt);
            }

        }

        return result;
    }

    public static boolean checkKey(Set<Integer> keys, int key) {
        boolean result = false;
        Iterator iterator = keys.iterator();

        while(iterator.hasNext()) {
            if((Integer) iterator.next() == key) {
                result = true;
            }
        }

        return result;
    }

    public static void printResult(Map<Integer, Integer> mapToPrint) {
        for(Map.Entry<Integer, Integer> entry : mapToPrint.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
