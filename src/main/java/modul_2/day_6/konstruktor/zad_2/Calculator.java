package modul_2.day_6.konstruktor.zad_2;

import modul_2.day_7.obiektowosc.zad_1.AdvancedCalculator;

import java.util.Arrays;

public class Calculator extends AdvancedCalculator {
    public String[] histOperation;

//    public String[] addPos(String[] strArr) {
//        return Arrays.copyOf(strArr, strArr.length + 1);
//    }

    public double add(double a, double b) {
        double result = a + b;
        String strResult = "added " + a + " to " + b + " got " + result;
        histOperation = addPos(histOperation);
        staticHistOper = addPos(staticHistOper);
        histOperation[histOperation.length - 1] = strResult;
        staticHistOper[staticHistOper.length - 1] = strResult;
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        String strResult = "multiplied " + a + " with " + b + " got " + result;
        histOperation = addPos(histOperation);
        staticHistOper = addPos(staticHistOper);
        histOperation[histOperation.length - 1] = strResult;
        staticHistOper[staticHistOper.length - 1] = strResult;
        return result;
    }

    public double subtract(double a, double b) {
        double result = b - a;
        String strResult = "subtracted " + b + " from " + a + " got " + result;
        histOperation = addPos(histOperation);
        staticHistOper = addPos(staticHistOper);
        histOperation[histOperation.length - 1] = strResult;
        staticHistOper[staticHistOper.length - 1] = strResult;
        return result;
    }

    public double divide(double a, double b) {
        double result;
        try {
            result = a / b;
            String strResult = "divided " + a + " by " + b + " got " + result;
            histOperation = addPos(histOperation);
            staticHistOper = addPos(staticHistOper);
            histOperation[histOperation.length - 1] = strResult;
            staticHistOper[staticHistOper.length - 1] = strResult;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Calculator() {
        histOperation = new String[0];
    }

    public void printOperations() {
        for (int i = 0; i < histOperation.length; i++) {
            System.out.println(histOperation[i]);
        }
    }

    public void clearOperations() {
        histOperation = Arrays.copyOf(histOperation, 0);
        System.out.println("Clear calculator");
    }
}
