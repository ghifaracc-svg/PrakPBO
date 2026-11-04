public class TestTiket {
    public static void main(String[] args) {
        TiketKereta kereta = new TiketKereta();
        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.hargaDasar = 350000;
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";
        kereta.tampilKereta();

        TiketDomestik domestik = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar",
                900000, "Garuda Indonesia", 25, 75000);
        domestik.tampilDomestik();

        TiketInternasional internasional = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura",
                2500000, "Singapore Airlines", 20, "C1234567", 150000);
        internasional.tampilInternasional();
    }
}
