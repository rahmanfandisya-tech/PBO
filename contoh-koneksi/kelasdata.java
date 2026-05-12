class Buku {
    String judul;
    int tahun;
    String penulis;

    // Constructor
    public Buku(String judul, int tahun, String penulis) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
    }
}

// Saat data dimasukkan di Java:
Buku buku1 = new Buku("Laskar Pelangi", 2005, "Andrea Hirata");
Buku buku2 = new Buku("Bumi", 2014, "Tere Liye");