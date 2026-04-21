public abstract class Tiket {
    private String nomor, tanggal;
    private int harga;

    public Tiket(String nomor, String tanggal, int harga) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.harga = harga;
    }

    public abstract double getTotalBayar();

    // Getters & Setters
    public int getHarga() { return harga; }
    public void setHarga(int harga) { this.harga = harga; }
    // ... getter setter lainnya ...
}