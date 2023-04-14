package example;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Mains {
    private static final Logger logger = Logger.getLogger(Mains.class.getName());
    public static void main(String[] args) {
        Circle circle = new Circle(1.955);
        Triangle triangle = new Triangle(4, 6);
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        logger.log(Level.INFO, () ->"Area of circle: " + circle.area());
        logger.log(Level.INFO, () ->"Area of triangle: " + triangle.area());
        logger.log(Level.INFO, () ->"Area of rectangle: " + rectangle.area());
    }

    public static interface Shape {
        double area();
    }
}
