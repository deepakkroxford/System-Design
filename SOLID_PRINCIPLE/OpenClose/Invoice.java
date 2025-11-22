package SOLID_PRINCIPLE.OpenClose;

public class Invoice {
    // Responsibility 1: Calculating Total
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
