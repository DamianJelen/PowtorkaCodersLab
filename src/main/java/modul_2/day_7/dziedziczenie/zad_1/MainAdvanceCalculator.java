package modul_2.day_7.dziedziczenie.zad_1;

public class MainAdvanceCalculator {
    public static void main(String[] args) {
        AdvancedCalculator calculator = new AdvancedCalculator();
        calculator.add(10, -8);
        calculator.pow(2,3);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.root(27,3);
        calculator.printOperations();
    }
}
