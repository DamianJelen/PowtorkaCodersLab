package modul_4.day_12.collections.zad_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Integer> intList = genIntList(10,20);
        System.out.println("List before:\n" + intList.toString());
        removeDivider(intList, 3);
        System.out.println("List after:\n" + intList.toString());
    }

    public static void removeDivider(List<Integer> list, int divider) {
        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            if(iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }

    public static List<Integer> genIntList(int from, int to) {
        List<Integer> result = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            result.add(i);
        }
        return result;
    }
}
