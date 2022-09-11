package modul_2.day_7.dziedziczenie.zad_3;

import modul_2.day_7.dziedziczenie.zad_2.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * radius;
    }
}
