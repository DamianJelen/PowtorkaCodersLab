package modul_2.day_7.obiektowosc.zad_1;

import modul_2.day_6.konstruktor.zad_2.Calculator;
import modul_2.day_7.dziedziczenie.zad_1.AdvancedCalculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator.computerCircleArea(10d);
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.add(2, 3);
        System.out.println("histOperation: " + Arrays.toString(advancedCalculator.histOperation) +
                "\n========================================================================================\n" +
                "Global hist operations: ");
        advancedCalculator.printGlobalOperations();
    }
}
