package modul_2.day_7.obiektowosc.zad_1;

import java.util.Arrays;

public class AdvancedCalculator{
    public final static double PI = 3.14159265;
    public static String[] staticHistOper = new String[0];

    public static double computerCircleArea(double r) {
        double result = 0;
        if (r > 0) {
            result = PI * Math.pow(r, 2);
            staticHistOper = addPos(staticHistOper);
            staticHistOper[staticHistOper.length - 1] = PI + " * " + r + "^2 = " + result;
        } else {
            System.out.println("The parameter r must be greater then 0");
        }
        return result;
    }

    public static String[] addPos(String[] strArr) {
        return Arrays.copyOf(strArr, strArr.length + 1);
    }

    public static void printGlobalOperations() {
        printGlobalOperations(staticHistOper.length);
    }

    public static void printGlobalOperations(int length) {
        for (int i = 0; i < staticHistOper.length; i++) {
            System.out.println(staticHistOper[i]);
            i = i == length - 1 ? staticHistOper.length : i;
        }
    }

    public static void printGlobalOperations(String length) {
        printGlobalOperations(String.valueOf(length));
    }
}
