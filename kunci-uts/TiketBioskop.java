public class TiketBioskop extends Tiket {
    private boolean isWeekend;

    public TiketBioskop(String nomor, String tanggal, int harga, boolean isWeekend) {
        super(nomor, tanggal, harga);
        this.isWeekend = isWeekend;
    }

    @Override
    public double getTotalBayar() {
        return isWeekend ? getHarga() + 20000 : getHarga();
    }
}