package tokobuku;

import java.util.Scanner;

public class MainTokoBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBuku tokobuku = new TokoBuku();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Catat Penjualan");
            System.out.println("4. Total Penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (option) {
                case 1:
                    System.out.print("Masukkan ID Buku: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    System.out.print("Masukkan judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan harga: ");
                    double price = scanner.nextDouble();
                    System.out.print("Masukkan stok: ");
                    int stock = scanner.nextInt();
                    TokoBuku.addBuku(new Buku(id, title, author, price, stock));
                    break;
                case 2:
                    TokoBuku.displaybooks();
                    break;
                case 3:
                    System.out.print("Masukkan nama pelanggan: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Masukkan ID Buku yang dibeli: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Masukkan jumlah buku yang dibeli: ");
                    int quantity = scanner.nextInt();
                    TokoBuku.recordPenjual(customerName, bookId, quantity);
                    break;
                case 4:
                    System.out.println("Total penjualan: " + TokoBuku.getTotalPenjualan());
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
