public class TiketKereta extends Tiket {
    private int kelas; // 1-3

    public TiketKereta(String nomor, String tanggal, int harga, int kelas) {
        super(nomor, tanggal, harga);
        this.kelas = kelas;
    }

    @Override
    public double getTotalBayar() {
        double total = getHarga();
        if (kelas == 1) total += getHarga() * 0.2;
        else if (kelas == 2) total += getHarga() * 0.1;

        if (kelas != 3) total -= 25000; // Diskon
        return total;
    }
}