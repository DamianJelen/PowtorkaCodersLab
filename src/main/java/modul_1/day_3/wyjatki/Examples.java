package modul_1.day_3.wyjatki;

public class Examples {
    public static void main(String[] args) {
        Examples examples = new Examples();
        examples.printMessage("Pierwsza jakaś wiadomość, kolejna jest pusta");
//        examples.printMessage_tryCatchFinally(null);
//        examples.divdedByZero();
        examples.convertStrToNum();
    }

    public void printMessage(String message) {
        if(message.isEmpty()) {
            throw new IllegalArgumentException("Brak wiadomości w parametrze metody printMessage");
        } else {
            System.out.println(message);
        }
    }

    public void printMessage_tryCatchFinally(String message) {
        try {
            printMessage(message);
//            System.out.println(message);
        } catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nCzęść finally która zawsze się wykona nawet po rzuceniu wyjątku");
        }
    }

    public void convertStrToNum() {
        try {
            int num = Integer.parseInt("abcdef");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void divdedByZero() {
        int a = 1, b = 0, c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero, cholero :) !!!");
        }
    }
}
