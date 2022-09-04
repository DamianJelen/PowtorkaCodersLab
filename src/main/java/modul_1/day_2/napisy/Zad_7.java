package modul_1.day_2.napisy;

public class Zad_7 {
    public static void main(String[] args) {
        System.out.println("Czy to jest palindrom:\n-----------------------");
        System.out.println("kajak -> " + isPalindrom("kajak"));
        System.out.println("radar -> " + isPalindrom("radar"));
        System.out.println("Kobyła ma mały bok -> " + isPalindrom("Kobyła ma mały bok"));
    }

    public static boolean isPalindrom(String str) {
        str = str.replaceAll(" ", "").trim().toLowerCase();
        return str.equals(Zad_6.reverseWord(str));
    }
}
