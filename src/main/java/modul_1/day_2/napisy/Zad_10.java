package modul_1.day_2.napisy;

public class Zad_10 {
    public static void main(String[] args) {
        System.out.println(" To jest    tekst do => " + countTokens(" To jest    tekst do "));
    }

    public static int countTokens(String str) {
        str = str.trim();
        str = str.replaceAll( " {1,}", " ");
        return str.split(" ").length;
    }
}
