package id.ac.polinema.relasiclass.tugasmandiri;

public class Rak {
    private String kode;
    // AGGREGATION: Buku dibuat di luar Rak, lalu dimasukkan lewat tambahBuku()
    private Buku[] daftarBuku;
    private int jumlah;

    public Rak(String kode, int kapasitas) {
        this.kode = kode;
        this.daftarBuku = new Buku[kapasitas];
    }

    public boolean tambahBuku(Buku buku) {
        if (jumlah >= daftarBuku.length) {
            System.out.println("Rak " + kode + " penuh.");
            return false;
        }
        daftarBuku[jumlah++] = buku;
        return true;
    }

    public String info() {
        String info = "Rak " + kode + ":\n";
        for (int i = 0; i < jumlah; i++) {
            info += "  - " + daftarBuku[i].info() + "\n";
        }
        return info;
    }
}
