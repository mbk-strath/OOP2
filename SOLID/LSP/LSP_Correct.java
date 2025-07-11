// Subclass Car can be substituted for Vehicle without breaking behavior
abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

public class LSP_Correct {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine(); // Works as expected
    }
}
