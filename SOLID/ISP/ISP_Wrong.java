// Interface is too fat — forces unused methods
interface Machine {
    void print();
    void scan();
    void fax();
}

class SimplePrinter implements Machine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}

public class ISP_Wrong {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print();
        printer.scan(); // Will throw runtime error
    }
}
