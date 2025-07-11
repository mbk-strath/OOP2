// New shapes would require modifying this class — violates OCP
class ShapeBad {
    String type;
}

class AreaCalculatorBad {
    public double area(ShapeBad shape) {
        if ("circle".equals(shape.type)) return 3.14 * 2 * 2;
        if ("square".equals(shape.type)) return 4 * 4;
        return 0;
    }
}

public class OCP_Wrong {
    public static void main(String[] args) {
        ShapeBad circle = new ShapeBad();
        circle.type = "circle";

        ShapeBad square = new ShapeBad();
        square.type = "square";

        AreaCalculatorBad calculator = new AreaCalculatorBad();
        System.out.println("Circle Area: " + calculator.area(circle));
        System.out.println("Square Area: " + calculator.area(square));
    }
}
