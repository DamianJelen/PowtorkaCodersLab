package modul_1.day_1.tablice;

public class Zad_8 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        System.out.println(contains(intArr,4));
        System.out.println(contains(intArr,-3));
    }

    public static boolean contains(int[] arr, int element) {
        for (int el: arr) {
            if (element == el) return true;
        }
        return false;
    }
}
