package modul_1.day_2.napisy;

import org.apache.commons.lang3.StringUtils;

public class Zad_14 {
    public static void main(String[] args) {
        System.out.println(reverseString("Tak"));
        System.out.println(toggleChar("CodersLab"));
        String[] strArr = {"Programowanie", "w", "Javie", "to", "sama", "przyjemność"};
        System.out.println(stringFromArray(strArr));
        System.out.println(checkPalindrome("Kajak"));
    }

    public static String reverseString(String str) {
        return StringUtils.reverse(str);
    }

    public static String toggleChar(String str) {
        return StringUtils.swapCase(str);
    }

    public static String stringFromArray(String[] strArr) {
        return StringUtils.joinWith(" ", strArr);
    }

    public static boolean checkPalindrome(String str) {
        str = StringUtils.deleteWhitespace(str).toLowerCase();
        return str.equals(reverseString(str));
    }
}
