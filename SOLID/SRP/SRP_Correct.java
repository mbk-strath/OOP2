// Class handles only invoice data logic
class Invoice {
    public double calculateTotal() {
        return 100.0; // Dummy value
    }
}

// Separate class handles printing
class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice Total: " + invoice.calculateTotal());
    }
}

public class SRP_Correct {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice); // Each class does one job
    }
}
