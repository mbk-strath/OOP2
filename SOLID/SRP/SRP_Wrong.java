// This class violates SRP by handling both logic and printing
class InvoiceBad {
    public double calculateTotal() {
        return 100.0;
    }

    public void print() {
        System.out.println("Invoice Total: " + calculateTotal());
    }
}

public class SRP_Wrong {
    public static void main(String[] args) {
        InvoiceBad invoice = new InvoiceBad();
        invoice.print(); // One class doing two unrelated jobs
    }
}
