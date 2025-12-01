
package Chapter5;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, radius, 0); 
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 5.0);
        Rectangle rectangle = new Rectangle("Red", 4.0, 6.0);

        System.out.println("--- Circle Details (Color: " + circle.color + ") ---");
        System.out.printf("Area: %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());
        
        System.out.println("\n--- Rectangle Details (Color: " + rectangle.color + ") ---");
        System.out.printf("Area (L=%.1f, W=%.1f): %.2f\n", rectangle.length, rectangle.width, rectangle.calculateArea());
        System.out.printf("Perimeter (L=%.1f, W=%.1f): %.2f\n", rectangle.length, rectangle.width, rectangle.calculatePerimeter());
    }
}