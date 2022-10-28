/*
* The program gets a a vehicle
* and it calculates the stats.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-17
*
* This is a Vehicle program
*/

/**
 * This is the main CarStatus Class.
 * Class CarStatus
 */
final class Main {


    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

       Bicycle bmx = new Bicycle("Red", 40);
       System.out.println("Created Bmx bike.\nStatus:\n");
       bmx.status();

       System.out.println("Set the cadence to 10\n");
       bmx.accelerate(10);
       bmx.status();

       System.out.println("\nAccelerate By 15:");
       bmx.accelerate(15);
       bmx.status();

       System.out.println("\nRing Bell.");
       bmx.ringBell();

       Truck bigTruck = new Truck("Grey", "HGC-3456F", 200);
       System.out.println("Created a Truck. \nStatus:\n");
       bigTruck.status();
       
       System.out.println("\nAccelerating, 10 of power for ten seconds:");
       bigTruck.accelerate(10,10);
       System.out.println("New speed: " + bigTruck.getSpeed());

       System.out.println("\nApplyed air pressure of 10:");
       bigTruck.provideAir(10);
       System.out.println("New speed: " + bigTruck.getSpeed());

       System.out.println("\nDone!");
    }
}
