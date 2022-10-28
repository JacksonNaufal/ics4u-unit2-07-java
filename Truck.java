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

public class Truck extends Vehicle {

    /**
     * This is the speed.
     */
     public String licensePlate;
    
    public Truck(String color, String licensePlate, int maxSpeed) {
            super(color, maxSpeed);
            this.licensePlate = licensePlate;
    }
    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * This sets the licensePlate.
     *
     * @param licensePlateNew this is the new variable.
     */
    public void setLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    public void provideAir(int airPressure) {
    super.setSpeed(super.getSpeed() - airPressure / 2);

        if (super.getSpeed() < 0) {
           super.setSpeed(0);
        }
    }

    public void status() {
        System.out.println(" ---> Speed: " + super.getSpeed());
        System.out.println(" ---> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" ---> licensePlate: " + this.getLicensePlate());
        System.out.println(" ---> Color: " + super.getColor());
    }
}
