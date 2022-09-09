package modul_2.day_6.examples;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        if (dog.equals(cat)) {
            System.out.println("Klasa Dog == Klasa Cat");
        } else {
            System.out.println("Klasa Dog <> Klasa Cat");
        }
    }
}
