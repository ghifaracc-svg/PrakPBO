package id.ac.polinema.relasiclass.tugasmandiri;

public class MainTugas {
    public static void main(String[] args) {
        Petugas petugas = new Petugas("Rina");
        Perpustakaan perpus = new Perpustakaan("Kampus Polinema", petugas, 2);

        Buku b1 = new Buku("Pemrograman Berorientasi Objek");
        Buku b2 = new Buku("Struktur Data");
        Buku b3 = new Buku("Basis Data");
        perpus.tambahBuku(b1, 1);
        perpus.tambahBuku(b2, 1);
        perpus.tambahBuku(b3, 2);

        Anggota a1 = new Anggota("A01", "Budi");
        Anggota a2 = new Anggota("A02", "Sari");

        perpus.pinjamkan(a1, b1);
        perpus.pinjamkan(a2, b1);
        System.out.println();
        perpus.info();
    }
}
