package id.ac.polinema.relasiclass.tugasmandiri;

public class Buku {
    private String judul;
    private boolean dipinjam;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public String info() {
        return judul + (dipinjam ? " (dipinjam)" : " (tersedia)");
    }
}
