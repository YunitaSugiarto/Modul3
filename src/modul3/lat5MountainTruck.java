
package modul3;

public class lat5MountainTruck extends lat5Truck {

    //the mountaintruck subclass adds one fields
    public int seatHeight;

    //the mountaintruck subclass has one constructor
    public lat5MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    //the mountaintruck subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] aku) {
        System.out.println("mulai berjalan");
        lat5MountainTruck MB = new lat5MountainTruck(0, 0, 0, 0);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);

    }

}
