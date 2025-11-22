package SOLID_PRINCIPLE.OpenClose;
class InvoiceDaoOld {
    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to DB...");
    }
}
// Responsibility: Managing Database Operations and file Operations
// BAD: This class violates OCP - needs modification for every new
// kind of save functoion.
class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to DB....");
    }

    // BAD: This design violates OCP
    // Every time we add a new save function, we need to modify the existing
    // InvoiceDao Class
    public void saveToFile() {
        System.out.println("Saveing to File");
    }
}
public class VoilitingOcp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "Black", 10, 2020), 10);

        invoice.calculateTotal();
        InvoiceDao databaseFileSave = new InvoiceDao(invoice);
        databaseFileSave.saveToDB();
        databaseFileSave.saveToFile();
        /**
         * Problem: If we want to add a new function like
         * saveToMongoDB(),
         * we need to modify InvoiceDao and all its derived classes(if
         * exists)
         * This violates the "closed for modification" part of OCP
         */
    }
}
