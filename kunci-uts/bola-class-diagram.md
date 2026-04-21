# Kunci Jawaban Class Diagram - UTS PBO Genap 2025/2026

Berikut adalah representasi diagram kelas untuk Soal 1 dan Soal 2 menggunakan standar notasi UML.

---

## 1. Diagram Kelas: Pendataan Klub Sepakbola (Soal 1)
[cite_start]Diagram ini merepresentasikan hubungan antara kelas `Pemain` dan `Klub` dengan relasi **Agregasi**[cite: 21, 67].

```mermaid
classDiagram
    class Pemain {
        -String nama
        -int nomorPunggung
        -int jumlahGol
        +Pemain(String nama)
        +Pemain(String nama, int nomorPunggung)
        +Pemain(String nama, int nomorPunggung, int jumlahGol)
        +setNama(String nama)
        +setNomorPunggung(int no)
        +setJumlahGol(int gol)
        +getNama() String
        +getNomorPunggung() int
        +getJumlahGol() int
    }

    class Klub {
        -String namaKlub
        -int jumlahPemain
        -Pemain[] daftarPemain
        +Klub(String namaKlub)
        +addPemain(Pemain p)
        +getPemain(int i) Pemain
        +getJumlahPemain() int
    }

    Klub "1" o-- "0..23" Pemain : memiliki