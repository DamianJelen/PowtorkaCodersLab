package modul_2.day_7.dziedziczenie.zad_1;

import modul_2.day_6.konstruktor.zad_2.Calculator;

public class AdvancedCalculator extends Calculator {
    public double pow(double a, double b) {
        double result = Math.pow(a, b);
        String strResult = a + " ^ " + b + " = " + result;
        histOperation = addPos(histOperation);
        staticHistOper = addPos(staticHistOper);
        histOperation[histOperation.length - 1] = strResult;
        return result;
    }

    public double root(double a, double b) {
        double result = 0;
        String strResult = "";
        histOperation = addPos(histOperation);
        staticHistOper = addPos(staticHistOper);
        if (b >= 1) {
            result = Math.pow(a, (1 / b));
            strResult = b + " root of " + a + " = " + result;
            histOperation[histOperation.length - 1] = strResult;
            staticHistOper[staticHistOper.length - 1] = strResult;
        } else {
            System.out.println("Stopień pierwiasta musi być >= 1");
        }
        return result;
    }
}
