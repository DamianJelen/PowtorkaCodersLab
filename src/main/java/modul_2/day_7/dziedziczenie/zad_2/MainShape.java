package modul_2.day_7.dziedziczenie.zad_2;

public class MainShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape(5,2, "blue");
        Shape shape2 = new Shape(-3, 8, "green");

        System.out.println(shape1.getDescription() + "\n" + shape2.getDescription());
        System.out.println("shape1 -> shape2 = " + shape1.getDistance(shape2));
        System.out.println("shape2 -> shape1 = " + shape2.getDistance(shape1));
    }
}
