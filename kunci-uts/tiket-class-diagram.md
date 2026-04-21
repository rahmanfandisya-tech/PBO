classDiagram
    class Tiket {
        <<abstract>>
        -String nomor
        -String tanggal
        -int harga
        +Tiket(String nomor, String tanggal, int harga)
        +getTotalBayar()* double
        +getHarga() int
        +setHarga(int harga)
    }

    class TiketPesawat {
        -double beratBagasi
        +TiketPesawat(String nomor, String tanggal, int harga, double berat)
        +getTotalBayar() double
    }

    class TiketBioskop {
        -boolean isWeekend
        +TiketBioskop(String nomor, String tanggal, int harga, boolean isWeekend)
        +getTotalBayar() double
    }

    class TiketKereta {
        -int kelas
        +TiketKereta(String nomor, String tanggal, int harga, int kelas)
        +getTotalBayar() double
    }

    Tiket <|-- TiketPesawat : is-a
    Tiket <|-- TiketBioskop : is-a
    Tiket <|-- TiketKereta : is-a