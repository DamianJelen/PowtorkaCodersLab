package modul_1.day_1.metody;

public class Zad_1 {
    public static void main(String[] args) {
        System.out.println("3x5 = " + multiply(3,5));
        System.out.println("5^2 = " + square(5));
        System.out.println("Przeliczenie 100 PLN -> " + convertToUsd(100, 4.84) + " USD");
        System.out.println(createName("Damian","Jeleñ", "Jeleñ"));
    }

    protected static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    protected static int square(int num) {
        return (int) Math.pow(num, 2d);
    }

    protected static double convertToUsd(double pln, double usdRate) {
        double result = Math.round((usdRate != 0 ? pln/usdRate*100 : 0d));
        return result/100;
    }

    protected static String createName(String name, String surname, String pseudonym) {
        return "Imie: " + name + "\n" +
                "Nazwisko: " + surname + "\n" +
                "Pseudonim: " + pseudonym;
    }
}
