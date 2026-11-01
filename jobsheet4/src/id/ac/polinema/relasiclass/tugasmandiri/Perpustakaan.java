package id.ac.polinema.relasiclass.tugasmandiri;

public class Perpustakaan {
    private String nama;
    // AGGREGATION: Petugas dibuat di luar, diterima lewat constructor
    private Petugas petugas;
    // COMPOSITION: seluruh Rak dibuat sendiri oleh Perpustakaan, tanpa setter/getter Rak[]
    private Rak[] daftarRak;

    public Perpustakaan(String nama, Petugas petugas, int jumlahRak) {
        this.nama = nama;
        this.petugas = petugas;
        this.daftarRak = new Rak[jumlahRak];
        this.initRak();
    }

    private void initRak() {
        for (int i = 0; i < daftarRak.length; i++) {
            this.daftarRak[i] = new Rak("R" + (i + 1), 3);
        }
    }

    public void tambahBuku(Buku buku, int nomorRak) {
        this.daftarRak[nomorRak - 1].tambahBuku(buku);
    }

    public void pinjamkan(Anggota anggota, Buku buku) {
        petugas.prosesPeminjaman(anggota, buku);
    }

    public void info() {
        System.out.println("Perpustakaan " + nama + " (petugas: " + petugas.getNama() + ")");
        for (Rak rak : daftarRak) {
            System.out.print(rak.info());
        }
    }
}
