package modul_4.day_12.collections.zad_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 10; i <= 19; i++) {
            integerList.add(i);
        }

        System.out.println("First method to get list elements (fori)");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }

        System.out.println("\nSecond method to get list elements (while)");
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nThird method to get list elements (for)");
        for(iterator = integerList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nFourth method to get list elements (for each)");
        for (int intVal : integerList) {
            System.out.print(intVal + " ");
        }

    }
}
