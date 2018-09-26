
package modul3;

public class lat3Gajah extends lat3Hewan {
    
    public static void testClassMethod(){
        System.out.println("The Class Method in lat3ewan...");
    }
    
    //meng-override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The Instance Method in lat3Gajah...");
    }
    public static void main(String[] args){
        lat3Gajah myGajah = new lat3Gajah();
        lat3Hewan myHewan = myGajah;
        lat3Hewan.testClassMethod();
        myHewan.testInstanceMethod();
        
    }
}
