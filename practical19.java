import java.lang.Math;

// Base class Shape
abstract class Shape {
    // Abstract methods area() and perimeter()
    public abstract double area();
    public abstract double perimeter();
}

// Derived class Circle
class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing abstract methods
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing abstract methods
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Derived class Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // Implementing abstract methods
    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class practical19 {
    public static void main(String[] args) {
        // Create objects of each class
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        
        // Calculate and display area and perimeter for each shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println();
        
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println();
        
        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
    }
}