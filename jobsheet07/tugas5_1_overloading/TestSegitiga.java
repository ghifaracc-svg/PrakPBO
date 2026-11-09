public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("totalSudut(60)      = " + s.totalSudut(60));
        System.out.println("totalSudut(60, 50)  = " + s.totalSudut(60, 50));
        System.out.println("keliling(3, 4, 5)   = " + s.keliling(3, 4, 5));
        System.out.println("keliling(3, 4)      = " + s.keliling(3, 4));
    }
}
