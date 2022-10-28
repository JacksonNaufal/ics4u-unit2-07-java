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

       Biplane biplane = new Biplane();
       biplane.setSpeed(212);
       System.out.println(biplane.getSpeed());

       Boeing boeing = new Boeing();
       boeing.setSpeed(422);
       System.out.println(boeing.getSpeed());

       int x = 0;

       while (x < 4) {
        boeing.accelerate();
        System.out.println(boeing.getSpeed());
        if (boeing.getSpeed() > 5000) {
            biplane.setSpeed(biplane.getSpeed() * 2);
        } else {
            boeing.accelerate();
        }
        x++;
       }
        System.out.println(biplane.getSpeed());
        System.out.println("\nDone!");
    }
}
