# Diagram Kelas: Sistem Ticketing (Soal 2)

Diagram ini menggunakan konsep **Inheritance (Pewarisan)** dan **Polimorfisme**. [cite_start]Kelas `Tiket` didefinisikan sebagai kelas abstrak yang menjadi induk bagi jenis tiket lainnya.

```mermaid
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
        +getNomor() String
        +setNomor(String nomor)
        +getTanggal() String
        +setTanggal(String tanggal)
    }

    class TiketPesawat {
        -double beratBagasi
        +TiketPesawat(String nomor, String tanggal, int harga, double beratBagasi)
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

    Tiket <|-- TiketPesawat : extends
    Tiket <|-- TiketBioskop : extends
    Tiket <|-- TiketKereta : extends