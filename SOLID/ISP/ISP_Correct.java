// Smaller interfaces allow for flexible implementations
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

// Class implements only what it needs
class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class ISP_Correct {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print();
        printer.scan();
    }
}
