package tokobuku;

public class Penjual {
    private String namapelanggan;
    private int idbuku;
    private int jumlah;

    public Penjual(String namapelanggan, int idbuku, int jumlah) {
        this.namapelanggan = namapelanggan;
        this.idbuku = idbuku;
        this.jumlah = jumlah;
    }

    public String getNamaPelanggan() {
        return namapelanggan;
    }

    public int getIdBuku() {
        return idbuku;
    }

    public int getJumlah() {
        return jumlah;
    }
}
