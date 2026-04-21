public class TiketPesawat extends Tiket {
    private double beratBagasi;

    public TiketPesawat(String nomor, String tanggal, int harga, double berat) {
        super(nomor, tanggal, harga);
        this.beratBagasi = (berat >= 0 && berat <= 15) ? berat : 0;
    }

    @Override
    public double getTotalBayar() {
        double biayaBagasi = (beratBagasi < 5) ? 0 : beratBagasi * 15000;
        return getHarga() + biayaBagasi;
    }
}