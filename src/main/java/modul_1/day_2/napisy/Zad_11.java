package modul_1.day_2.napisy;

public class Zad_11 {
    public static void main(String[] args) {
        String exampleStr = "Java-zadania-podzial-napisow";
        System.out.println("onlyTwoElements:");
        System.out.println(onlyTwoElements(exampleStr, '-')[0] + "\n" + onlyTwoElements(exampleStr, '-')[1]);
        System.out.println("\nonlyTwoElements_2:");
        System.out.println(onlyTwoElements_2(exampleStr, '-'));
    }

    public static String[] onlyTwoElements(String str, char separator){
        String[] strArr = str.split(String.valueOf(separator), 2);
        return strArr;
    }

    public static String onlyTwoElements_2(String str, char separator){
        str = str.replaceFirst(String.valueOf(separator), "\n");
        return str;
    }
}
