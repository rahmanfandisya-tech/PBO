

public class Main {
    public static void main(String[] args) {
        Klub klub1 = new Klub("CoderTua");
        klub1.addPemain(new Pemain("Dennis Ritchie", 21, 2));
        klub1.addPemain(new Pemain("Bjarne Stroustrup", 12, 3));

        Klub klub2 = new Klub("AkiDev");
        klub2.addPemain(new Pemain("Rasmus Lerdorf", 11, 4));
        klub2.addPemain(new Pemain("James Gosling", 7, 5));
        klub2.addPemain(new Pemain("Guido van Rossum", 18, 1));

        tampilkanKlub(klub1);
        tampilkanKlub(klub2);
    }

    public static void tampilkanKlub(Klub k) {
        System.out.println("Nama klub: " + k.getNamaKlub());
        System.out.println("Jumlah pemain: " + k.getJumlahPemain());
        System.out.println("Daftar pemain:");
        Pemain[] list = k.getDaftarPemain();
        for (int i = 0; i < k.getJumlahPemain(); i++) {
            System.out.println((i+1) + ". " + list[i].getNama() + 
                ", no " + list[i].getNomorPunggung() + 
                ", gol = " + list[i].getJumlahGol());
        }
    }
}