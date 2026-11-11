public class Main {
    public static void main(String[] args) {
        Gatotkaca g = new Gatotkaca("Gatots", 99);
        CaptainIndonesia ci = new CaptainIndonesia("Caps", 77);

        g.attack(new Evil());
        ci.attack(new Evil());
        ci.attack(new Villain());
    }
}
