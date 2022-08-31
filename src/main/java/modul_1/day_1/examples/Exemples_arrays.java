package modul_1.day_1.examples;

import java.util.Arrays;

public class Exemples_arrays {
    public static void main(String[] args) {
        System.out.println(showSortedArraysElem(new int[] {120,3,45}));
        System.out.println(arrayReference());
        System.out.println(copyArrayByClone());
        System.out.println(copyArrayByCopyOf());
        System.out.println(setArrayDefaultValue(5));
    }

    protected static String showSortedArraysElem (int[] numbers) {
        Arrays.sort(numbers);
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i] + " ";
        }
        return result;
    }

    protected static String arrayReference() {
        int[] tab = {1,2,3,4};
        int[] copyTab = tab;
        tab[3] = 10;
        return copyTab[3] + "";
    }

    protected static String copyArrayByClone() {
        int[] tab = {1,2,3,4,5};
        int[] cloneTab = tab.clone();
        return "Oryginal tab: " + showSortedArraysElem(tab) + "\nClone tab: " + showSortedArraysElem(cloneTab);
    }

    protected static String copyArrayByCopyOf() {
        int[] tab = {1,2,3,4,5};
        int[] copyOfTab3 = Arrays.copyOf(tab, 3);
        return "Oryginal tab: " + showSortedArraysElem(tab) + "\nCopy of tab first 3 elements: " + showSortedArraysElem(copyOfTab3);
    }

    protected static String setArrayDefaultValue(int defaltValue) {
        int[] intArr = new int[5];
        Arrays.fill(intArr, defaltValue);
        return Arrays.toString(intArr);
    }
}
