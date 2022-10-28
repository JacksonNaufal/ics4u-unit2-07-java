/*
* This is a program that gets the Vehicle status
* from Vehicle to carStatus
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-24
*/

/**
 * This is the class for Vehicle.
 * Make class Vehicle.
 */

public class Boeing extends Biplane {

    /**
     * This returns the new speed.
     *
     * @return this returns the newSpeed.
     */
    public void setSpeed(int newSpeed) {
        super.setSpeed(newSpeed * 2);
    }

    /**
     * This sets the licensePlate.
     *
     * @param newSpeed this is the new variable.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
