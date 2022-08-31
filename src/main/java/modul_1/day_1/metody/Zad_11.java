package modul_1.day_1.metody;

public class Zad_11 {
    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }

    protected static double dogAge(double dogAge) {
        if(dogAge > 2) {
            return 2 * 10.5 + (dogAge - 2) *4;
        } else if(dogAge > 0 && dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 0;
        }

    }
}
