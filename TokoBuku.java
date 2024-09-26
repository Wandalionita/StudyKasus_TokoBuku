package tokobuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokoBuku {

    static void addBuku(Buku buku) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void recordPenjual(String customerName, int bookId, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String getTotalPenjualan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void displaybooks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final List<Buku> buku;
    private final List<Penjual> penjual;
    private final double totalpenjualan;

    public TokoBuku() {
        buku = new ArrayList<>();
        penjual = new ArrayList<>();
        totalpenjualan = 0.0;
    }

    public void addbuku(Buku buku) {
        buku.add(buku);
    }

    public void displayBuku() {
        if (buku.isEmpty()) {
            System.out.println("Tidak ada buku di toko.");
            return;
        }
        for (Buku book : buku) {
            System.out.println(book);
        }
    }

    public void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        String title = scanner.nextLine();

        for (Buku book : buku) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                buku.remove(buku);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }

        System.out.println("Buku dengan judul '" + title + "' tidak ditemukan.");
    }

    public double getTotalpenjualan() {
        return totalpenjualan;
    }
}

