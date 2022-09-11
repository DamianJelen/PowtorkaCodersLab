package modul_2.day_7.dziedziczenie.zad_2;

public class Shape {
    private int x, y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public double getDistance(Shape shape) {
        double result = Math.pow((shape.x - this.x), 2) + Math.pow((shape.y - this.y), 2);
        result = Math.sqrt(result);
        result = Math.abs(result);
        return result;
    }
}
