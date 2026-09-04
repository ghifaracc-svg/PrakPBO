public class TestBarang {

    public static void main(String[] args){

        Barang barang1 = new Barang();


        barang1.kode = "BR001";
        barang1.namaBarang = "Laptop";
        barang1.hargaDasar = 8000000;
        barang1.diskon = 0.10f;


        barang1.tampilData();

    }
}