
package modul3;

public class lat4DemoOverride2 {

    public static void main(String[] args) {
        lat4B obj = new lat4B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
