
package modul3;

public class lat2Employ extends lat2Person {

    private String noKaryawan;

    //Konstruktor
    public lat2Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }

    //Metode
    public void info() {
    
    System.out.println ("No. Karyawan : " + this.noKaryawan);
    super.info();

    }
}