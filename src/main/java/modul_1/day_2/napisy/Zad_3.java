package modul_1.day_2.napisy;

public class Zad_3 {
    public static void main(String[] args) {
        String str = "CodersLab";
        System.out.println(firstHalf(str));
    }

    public static String firstHalf(String str) {
        return str.substring(0, Math.round(str.length()/2));
    }
}
