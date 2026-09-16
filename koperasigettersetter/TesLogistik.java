package koperasigettersetter;

import java.util.Scanner;

public class TesLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal Kontainer : " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input pertama - tambah muatan
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double beratTambah1 = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(beratTambah1);
        System.out.println("Berat muatan saat ini : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input kedua - tambah muatan lagi
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double beratTambah2 = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(beratTambah2);
        System.out.println("Berat muatan saat ini : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input pertama - turunkan muatan
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double beratTurun1 = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input kedua - turunkan muatan lagi
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double beratTurun2 = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}