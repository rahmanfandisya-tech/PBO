import java.security.Permissions;


import luar.semut;

public class Main {
    public static void main(String[] args) {
      
      
        Kucing k1 = new Kucing();

        k1.nama = "moly";
        String namakucing = k1.nama;




        //k1.umur = 10;

       k1.setUmur(10);
        int umur = k1.getUmur();


    }
}








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