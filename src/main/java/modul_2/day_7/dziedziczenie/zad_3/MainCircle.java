package modul_2.day_7.dziedziczenie.zad_3;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, 8, "red", 3);
        Circle circle2 = new Circle(-3, 2, "white", 2.3);

        System.out.println(circle1.getDescription() + "\n" + circle2.getDescription());
        System.out.println("circle1 -> circle2 = " + circle1.getDistance(circle2));
        System.out.println("circle2 -> circle1 = " + circle2.getDistance(circle1));
        System.out.println("circle2 -> circle2 = " + circle2.getDistance(circle2));

    }
}
