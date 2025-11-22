package SOLID_PRINCIPLE.OpenClose;
interface InvoiceDao {
    public void save();
}
// Concrete implementation for DatabaseInvoiceDao
class DatabaseInvoiceDao implements InvoiceDao {

    private Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}
// Concrete implementation for FileInvoiceDao
// NEW File Save Operation: An extension without modification!
class FileInvoiceDao implements InvoiceDao {

    private Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // Save into the file the invoice
        System.out.println("Saving to file...");
    }
}
public class FollowOcp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(
                new Marker("name", "color", 10, 2020),
                10);
        invoice.calculateTotal();

        InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save(); // Save to DB

        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save(); // Save to File

        // The system is:
        // - OPEN for extension (new save functions can be added)
        // - CLOSED for modification (existing code remains unchanged)









        
        /**
         * Key Benefits of the Refactored Code
         * Reduced risk: Existing tested code remains unchanged.
         * Better maintainability: New features don't break existing functionality.
         * Improved flexibility: Easy to add new behaviors without touching existing
         * code.
         * Enhanced testability: New extensions can be tested independently.
         * Supports polymorphism: Enables dynamic behavior through interfaces and
         * inheritance.
         */
    }
}
