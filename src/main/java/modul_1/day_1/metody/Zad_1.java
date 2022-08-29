package modul_1.day_1.metody;

public class Zad_1 {
    public static void main(String[] args) {
        System.out.println("3x5 = " + multiply(3,5));
        System.out.println("5^2 = " + square(5));
        System.out.println("Przeliczenie 100 PLN -> " + convertToUsd(100, 4.84) + " USD");
        System.out.println(createName("Damian","Jeleñ", "Jeleñ"));
        System.out.println("Kwota netto z kwoty 5000 -> " + calculateNetto(5000, 12));
        System.out.println("16 " + checkMaturity(16));
        System.out.println("19 jest " + checkEvenOdd(19));
        System.out.println("Max(4,7,3) = " + maxOfThree(4, 7, 3));
        System.out.println("4! = " + factorial(4));
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

    protected static double calculateNetto(double gross, double vat) {
        return gross + gross * vat;
    }

    protected static boolean checkMaturity(int age) {
        return age > 18 ? true : false;
    }

    protected static String checkEvenOdd(int number){
        return number % 2 == 0 ? "even" : "odd";
    }

    protected static int maxOfThree(int num1, int num2, int num3){
        return num1 < num2 ? (num2 < num3 ? num3 : num2) : (num1 < num3 ? num3 : num1);
    }

    protected static int factorial(int n){
        int result = 1;
        int licz = 0;
        while(licz < n) {
            ++licz;
            result *= licz;
        }
        return result;
    }
}
