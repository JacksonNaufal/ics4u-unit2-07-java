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

public class Bicycle extends Vehicle {

    private int cadence = 0;

    public Bicycle(String color, int maxSpeed) {
            super(color, maxSpeed);
    }
    /**
     * This sets the licensePlate.
     *
     * @param newSpeed this is the new variable.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }

    public int getCadence() {
     return this.cadence;
    }

    public void ringBell() {
    System.out.println("\nDing ding!");
    }

    public void accelerate(int appliedPower) {
        super.setSpeed(super.getSpeed() * 2);
    }

    public void status() {

        System.out.println(" ---> Speed: " + super.getSpeed());
        System.out.println(" ---> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" ---> licensePlate: " + this.getCadence());
        System.out.println(" ---> Color: " + super.getColor());
    }
}

