package studikasus;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;
    private List<Sale> sales;
    private double totalSales;

    public BookStore() {
        books = new ArrayList<>();
        sales = new ArrayList<>();
        totalSales = 0.0;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku di toko.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void recordSale(String customerName, int bookId, int quantity) {
        for (Book book : books) {
            if (book.getId() == bookId && book.getStock() >= quantity) {
                book.reduceStock(quantity);
                double saleAmount = book.getPrice() * quantity;
                totalSales += saleAmount;
                sales.add(new Sale(customerName, bookId, quantity));
                System.out.println("Penjualan berhasil: " + quantity + " buku " + book.getTitle() + " oleh " + customerName);
                return;
            }
        }
        System.out.println("Penjualan gagal: Buku tidak ditemukan atau stok tidak cukup.");
    }

    public double getTotalSales() {
        return totalSales;
    }
}
