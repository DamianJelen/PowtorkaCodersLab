package modul_1.day_1.metody;

public class Zad_1 {
    public static void main(String[] args) {
        System.out.println("3x5 = " + multiply(3,5));
        System.out.println("5^2 = " + square(5));
    }

    protected static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    protected static int square(int num) {
        return (int) Math.pow(num, 2d);
    }
}
