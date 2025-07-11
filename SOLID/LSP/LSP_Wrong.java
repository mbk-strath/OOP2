// Bicycle breaks the contract because startEngine doesn't make sense here
class VehicleBad {
    public void startEngine() {
        System.out.println("Engine started");
    }
}

class Bicycle extends VehicleBad {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }
}

public class LSP_Wrong {
    public static void main(String[] args) {
        VehicleBad bike = new Bicycle();
        bike.startEngine(); // Crashes! Violates LSP
    }
}
