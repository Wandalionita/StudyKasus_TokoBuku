package studikasus;

public class Sale {
    private String customerName;
    private int bookId;
    private int quantity;

    public Sale(String customerName, int bookId, int quantity) {
        this.customerName = customerName;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }
}

