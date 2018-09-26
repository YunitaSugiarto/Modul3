package modul3;

import java.util.Scanner;

public class TgsMatpel extends TgsSekolah {

    public TgsMatpel(int Normatif, int Adaptif, int Produktif) {
        super(Normatif, Adaptif, Produktif);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TgsMatpel abc = new TgsMatpel(0, 0, 0);
        System.out.println("KATEGORI MATA PELAJARAN SMK");
        System.out.println("1. Normatif");
        System.out.println("2. Adaptif");
        System.out.println("3. Produktif");
        System.out.print("Pilih = ");
        int pilih = scan.nextInt();
        if (pilih == 1) {
            System.out.println("1. Pendidikan Agama");
            System.out.println("2. PKN");
            System.out.println("3. Bimbingan Konseling");
        }
        if (pilih == 2) {
            System.out.println("1. Matematika");
            System.out.println("2. Bahasa");
            System.out.println("3. IPA");
            System.out.println("4. PJOK");
            System.out.println("5. Seni Budaya");
        }
        if (pilih == 3) {
            System.out.println("1. Produktif RPL");
            System.out.println("2. SisTel");
            System.out.println("3. Komjardas");
            System.out.println("4. Desain Grafis");
            System.out.println("5. Siskomdig");
        }

    }
}
