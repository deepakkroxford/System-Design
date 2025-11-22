package SOLID_PRINCIPLE.SRP;

// Responsibility 1: Calculating Total
class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        this.total = this.marker.price * this.quantity;
        System.out.println(total);
    }
}
// Responsibility 2: Managing Database Operations only
class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}

// Responsibility 3: Printing the Invoice only
class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Printing Invoice");
    }

}

public class FollowSrp {
    public static void main(String[] args) {
        // create the service objects
        Invoice invoice = new Invoice(new Marker("name", "color", 10,
                2020), 10);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        // Use the services
        invoice.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.printInvoice();
    }
}
