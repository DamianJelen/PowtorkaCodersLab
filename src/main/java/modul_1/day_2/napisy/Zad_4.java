package modul_1.day_2.napisy;

public class Zad_4 {
    public static void main(String[] args) {
        String str = "CodersLab";
        System.out.println(containsStr(str, "sL"));
    }

    public static boolean containsStr(String str, String search) {
        for (int i = 0; i < str.length() - search.length(); i++) {
            if(str.substring(i, i + search.length()).equals(search)) {
                return true;
            }
        }
        return false;
    }
}
