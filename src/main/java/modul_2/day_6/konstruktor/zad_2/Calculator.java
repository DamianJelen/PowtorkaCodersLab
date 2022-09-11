package modul_2.day_6.konstruktor.zad_2;

import java.util.Arrays;

public class Calculator {
    protected String[] histOperation;

    protected String[] addPos(String[] strArr) {
        return Arrays.copyOf(strArr, strArr.length + 1);
    }

    public double add(double a, double b) {
        double result = a + b;
        histOperation = addPos(histOperation);
        histOperation[histOperation.length - 1] = "added " + a + " to " + b + " got " + result;
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        histOperation = addPos(histOperation);
        histOperation[histOperation.length - 1] = "multiplied " + a + " with " + b + " got " + result;
        return result;
    }

    public double subtract(double a, double b) {
        double result = b - a;
        histOperation = addPos(histOperation);
        histOperation[histOperation.length - 1] = "subtracted " + b + " from " + a + " got " + result;
        return result;
    }

    public double divide(double a, double b) {
        double result;
        try {
            result = a / b;
            histOperation = addPos(histOperation);
            histOperation[histOperation.length - 1] = "divided " + a + " by " + b + " got " + result;
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
