import java.security.Permissions;


import luar.semut;

public class Main {
    public static void main(String[] args) {
      
        Kendaraan mobil = new Kendaraan();

        // Mengakses data Public & Protected
        System.out.println("Merek: " + mobil.merek);
        System.out.println("Tahun: " + mobil.tahun);

        // Mengakses data Private
        // System.out.println(mobil.nomorMesin); // <-- ERROR: Tidak bisa diakses langsung
        mobil.tampilkanNomorMesin(); // Berhasil melalui method public

        Kucing k1 = new Kucing();

        k1.nama = "moly";



        k1.setUmur(10);
        v = k1.getUmur();


    }
}





// class Kendaraan {
//     // PUBLIC: Bisa diakses dari mana saja (semua class & package)
//     public String merek = "Toyota";

//     // PROTECTED: Bisa diakses oleh class di package yang sama & subclass (turunan)
//     protected int tahun = 2022;

//     // PRIVATE: Hanya bisa diakses di dalam class 'Kendaraan' itu sendiri
//     private String nomorMesin = "SN12345ABC";

//     // Method public untuk mengakses data private (Getter)
//     public void tampilkanNomorMesin() {
//         System.out.println("Nomor Mesin (Private): " + nomorMesin);
//     }
// }


class Kucing{

    public  String nama;
    protected   String warna;
    private  int umur;

public void setUmur(int umur) {
    this.umur = umur;
}
public int getUmur() {
    return umur;
}



}


class Persia extends Kucing{



}