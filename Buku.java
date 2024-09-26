package tokobuku;

public class Buku {
    private int id;
    private String judulbuku;
    private String penulis;
    private double harga;
    private int stok;

    public Buku(int id, String judulbuku, String penulis, double harga, int stok) {
        this.id = id;
        this.judulbuku = judulbuku;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void reduceStok(int amount) {
        stok -= amount;
    }

    public String toString() {
        return "ID: " + id + ", Judul: " + judulbuku + ", Penulis: " + penulis + ", Harga: " + harga + ", Stok: " + stok;
    }

    void add(Buku buku) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getStock() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void reduceStock(int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

