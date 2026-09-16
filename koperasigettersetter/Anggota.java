package koperasigettersetter;

public class Anggota {
    private String nama;
    private String alamat;
    private double simpanan;

    public Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0.0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getSimpanan() {
        return simpanan;
    }

    public void setor(double jumlah) {
        this.simpanan += jumlah;
    }

    public void pinjam(double jumlah) {
        this.simpanan -= jumlah;
    }
}