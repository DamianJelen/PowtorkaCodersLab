package modul_2.day_6.konstruktor.zad_2;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(2, 2);
        calculator.multiply(3, 4);
        calculator.divide(10, 2.5);
        calculator.subtract(5, 2);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();
        calculator.multiply(5,5);
        calculator.divide(6,2);
        calculator.printOperations();
    }
}
