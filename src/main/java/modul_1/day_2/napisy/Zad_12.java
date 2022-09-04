package modul_1.day_2.napisy;

public class Zad_12 {
    public static void main(String[] args) {
        String str = "Ala ma kota, a kot ma Alę.";
        System.out.println(replaceChar(str, 'a', 'b'));
        System.out.println(replaceStr(str, "kot", "pies"));
        System.out.println(upperCase(str, 5));
        System.out.println(tripple("aaawsxbbbbbb"));
    }

    public static String replaceChar(String str, char forReplace, char replacement) {
        return str.replaceAll(String.valueOf(forReplace), String.valueOf(replacement));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }

    public static String upperCase(String str, int index) {
        String result = "";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            result += i % index == 0 ? Character.toUpperCase(charArr[i]) : charArr[i];
        }
        return result;
    }

    public static int tripple(String str) {
        int result = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            int tmpLicz = 0;
            for (int j = i + 1; j <= i + 2; j++) {
                tmpLicz += charArr[i] == charArr[j] ? 1 : 0;
            }
            if (tmpLicz == 2) {
                result++;
                i = i + 2;
            }
        }
        return result;
    }
}
