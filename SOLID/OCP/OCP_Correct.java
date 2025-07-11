// Shape is open for extension via new implementations, but closed for modification
interface Shape {
    double area();
}

class Circle implements Shape {
    public double area() {
        return 3.14 * 2 * 2; // Radius = 2
    }
}

class Square implements Shape {
    public double area() {
        return 4 * 4; // Side = 4
    }
}

public class OCP_Correct {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
    }
}
