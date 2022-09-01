package modul_1.day_2.napisy;

public class Zad_2 {
    public static void main(String[] args) {
        System.out.println(charPos("Ala ma kota",'m'));
    }

    public static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
