package modul_1.day_3.wpro_danych;

import java.util.Scanner;

public class Zad_5 {
    public static void main(String[] args) {
        textLines();
    }

    public static void textLines() {
        Scanner scanner = new Scanner(System.in);
        int licz = 0;
        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println("Jeżeli chcesz zakończyć działanie programu wpisz 'quit'.\nWprowadź tekst: ");
        String tmpStr = "";
        while(!tmpStr.equals("quit")) {
            System.out.println("Jeżeli chcesz zakończyć działanie programu wpisz 'quit'.\nWprowadź tekst: ");
            tmpStr = scanner.nextLine();
            if(!tmpStr.equals("quit")) {
                stringBuilder.append("Text " + ++licz + ": ").append(tmpStr).append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
