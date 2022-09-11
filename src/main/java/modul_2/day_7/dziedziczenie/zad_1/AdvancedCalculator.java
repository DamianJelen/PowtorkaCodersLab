package modul_2.day_7.dziedziczenie.zad_1;

import modul_2.day_6.konstruktor.zad_2.Calculator;

public class AdvancedCalculator extends Calculator {
    public double pow(double a, double b) {
        double result = Math.pow(a, b);
        histOperation = addPos(histOperation);
        histOperation[histOperation.length - 1] = a + " ^ " + b + " = " + result;
        return result;
    }

    public double root(double a, double b) {
        double result = 0;
        histOperation = addPos(histOperation);
        if (b >= 1) {
            result = Math.pow(a, (1 / b));
            histOperation[histOperation.length - 1] = b + " root of " + a + " = " + result;
        } else {
            System.out.println("Stopień pierwiasta musi być >= 1");
        }
        return result;
    }
}
