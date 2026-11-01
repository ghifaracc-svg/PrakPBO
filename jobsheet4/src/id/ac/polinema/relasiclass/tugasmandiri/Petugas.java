package id.ac.polinema.relasiclass.tugasmandiri;

public class Petugas {
    private String nama;

    public Petugas(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // DEPENDENCY: Anggota dan Buku hanya muncul sebagai parameter, tidak disimpan sebagai atribut.
    public void prosesPeminjaman(Anggota anggota, Buku buku) {
        if (buku.isDipinjam()) {
            System.out.println("Petugas " + nama + ": buku \"" + buku.getJudul()
                    + "\" sedang dipinjam.");
            return;
        }
        buku.setDipinjam(true);
        System.out.println("Petugas " + nama + " meminjamkan \"" + buku.getJudul()
                + "\" kepada " + anggota.getNama() + ".");
    }
}
