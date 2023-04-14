package example;

public class Circle implements Mains.Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}