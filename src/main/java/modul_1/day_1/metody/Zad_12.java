package modul_1.day_1.metody;

public class Zad_12 {
    public static void main(String[] args) {
        System.out.println("10/2 = " + divisibleBy(10, 2));
        System.out.println("10/2 = " + divisibleBy(9, 2));
    }
    
    protected static boolean divisibleBy(int a, int b) {
        return a % b == 0 ? true : false;
    }
}
