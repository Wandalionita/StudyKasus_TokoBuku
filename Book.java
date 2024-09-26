package studikasus;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(int id, String title, String author, double price, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int amount) {
        stock -= amount;
    }

    public String toString() {
        return "ID: " + id + ", Judul: " + title + ", Penulis: " + author + ", Harga: " + price + ", Stok: " + stock;
    }
}
