

public class Klub {
    private String namaKlub;
    private int jumlahPemain;
    private Pemain[] daftarPemain;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.daftarPemain = new Pemain[23]; // Maksimal 23 pemain
        this.jumlahPemain = 0;
    }

    public void addPemain(Pemain p) {
        if (jumlahPemain < 23) {
            daftarPemain[jumlahPemain] = p;
            jumlahPemain++;
        }
    }

    public Pemain getPemain(int nomorPunggung) {
        for (int i = 0; i < jumlahPemain; i++) {
            if (daftarPemain[i].getNomorPunggung() == nomorPunggung) {
                return daftarPemain[i];
            }
        }
        return null;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    public String getNamaKlub() { return namaKlub; }
    public Pemain[] getDaftarPemain() { return daftarPemain; }
}