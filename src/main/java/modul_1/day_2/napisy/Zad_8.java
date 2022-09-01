package modul_1.day_2.napisy;

public class Zad_8 {
    public static void main(String[] args) {
        System.out.println(toggleChar("TaK"));
        System.out.println(toggleChar("CodersLab"));
        System.out.println(toggleChar("Maciek i Ala to wspaniała para"));
    }

    public static String toggleChar(String str) {
        String result = "";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            result += Character.isUpperCase(charArr[i]) ? Character.toLowerCase(charArr[i]) :  Character.toUpperCase(charArr[i]);
        }
        return result;
    }
}
