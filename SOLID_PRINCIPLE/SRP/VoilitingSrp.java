package SOLID_PRINCIPLE.SRP;

class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculate the total (business logic)
    public void calculateTotal() {
        System.out.println("Calculating total....");
        this.total = this.marker.price * this.quantity;
        System.out.println(total);
    }

    // Responsibility 2: Database Operation
    public void saveToDb() {
        System.out.println("Save into Database.....");
    }

    // Responsibility 3: Print the Invoice
    public void printInvoice() {
        System.out.println("Printing Invoice");
    }
}

public class VoilitingSrp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "red", 10, 2025), 10);
        invoice.calculateTotal();
        ;
        invoice.saveToDb();
        invoice.printInvoice();

        /**
         * The Invoice class has 3 different responsibilities
         * 1. calculateTotal() → Responsibility 1: Calculate the total(business logic)
         * 2. saveToDB() → Responsibility 2: Database Operations
         * 3. printInvoice() → Responsibility 3: Print the Invoice
         * 
         * This violates SRP because:
         * If the tax calculation rules change, we need to modify the Invoice class. If
         * the database structure changes, we need to modify the Invoice class. If the
         * printing requirement changes, we need to modify the Invoice class.
         */
    }
}
