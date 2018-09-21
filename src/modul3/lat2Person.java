
package modul3;

public class lat2Person {

    private String nama;
    private int usia;

    //Konstruktor
    public lat2Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    //Metode
    public void info() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Usia : " + this.usia);
    }
}
