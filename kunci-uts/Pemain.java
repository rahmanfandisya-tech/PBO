public class Pemain {
    private String nama;
    private int nomorPunggung;
    private int jumlahGol;

    // Constructor 1: Inisialisasi nama
    public Pemain(String nama) {
        this.setNama(nama);
    }

    // Constructor 2: Inisialisasi nama dan nomor punggung
    public Pemain(String nama, int nomorPunggung) {
        this.setNama(nama);
        this.setNomorPunggung(nomorPunggung);
    }

    // Constructor 3: Inisialisasi nama, nomor punggung, dan jumlah gol
    public Pemain(String nama, int nomorPunggung, int jumlahGol) {
        this.setNama(nama);
        this.setNomorPunggung(nomorPunggung);
        this.setJumlahGol(jumlahGol);
    }

    // Encapsulation dengan validasi
    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        }
    }

    public void setNomorPunggung(int nomorPunggung) {
        if (nomorPunggung >= 1 && nomorPunggung <= 23) {
            this.nomorPunggung = nomorPunggung;
        }
    }

    public void setJumlahGol(int jumlahGol) {
        if (jumlahGol >= 0) {
            this.jumlahGol = jumlahGol;
        }
    }

    public String getNama() { return nama; }
    public int getNomorPunggung() { return nomorPunggung; }
    public int getJumlahGol() { return jumlahGol; }
}