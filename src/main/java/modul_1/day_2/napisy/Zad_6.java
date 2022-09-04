package modul_1.day_2.napisy;

public class Zad_6 {
    public static void main(String[] args) {
        System.out.println("kot reverse -> " + reverseWord("kot"));
        System.out.println("kajak reverse -> " + reverseWord("kajak"));
    }

    public static String reverseWord(String str) {
        String result = "";
        char[] charArr = str.toCharArray();

        for (int i = charArr.length - 1; i >= 0 ; i--) {
            result += charArr[i];
        }

        return result;
    }
}
