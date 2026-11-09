public class TestManusia {
    public static void main(String[] args) {
        Manusia m;

        m = new Manusia();
        m.bernafas();
        m.makan();

        System.out.println("-----");
        m = new Dosen();
        m.bernafas();
        m.makan();

        System.out.println("-----");
        m = new Mahasiswa();
        m.bernafas();
        m.makan();

        System.out.println("-----");
        Manusia[] daftar = {new Dosen(), new Mahasiswa(), new Manusia()};
        for (Manusia x : daftar) {
            x.makan();
            if (x instanceof Dosen) {
                ((Dosen) x).lembur();
            } else if (x instanceof Mahasiswa) {
                ((Mahasiswa) x).tidur();
            }
        }
    }
}
