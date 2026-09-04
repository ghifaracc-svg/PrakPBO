public class TestLingkaran {
    public static void main(String[] args){

        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.phi = 3.14;
        lingkaran1.r = 7;

        System.out.println("Radius : "+lingkaran1.r);
        System.out.println("Area : "+lingkaran1.hitungLuas());
        System.out.println("Circumference : "+lingkaran1.hitungKeliling());
    }
}
