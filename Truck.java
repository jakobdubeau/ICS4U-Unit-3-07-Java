/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Truck class.
*/
public class Truck extends Vehicle {

    /**
    * Plate.
    */
    private String liscensePlate;

    /**
    * Initial values.
    *
    * @param startPlate plate
    * @param startMaxSpeed max
    * @param startColour colour
    */

    public Truck(final String startPlate, final int startMaxSpeed,
                 final String startColour) {

        super(startColour, startMaxSpeed);
        this.liscensePlate = startPlate;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public String getLiscence() {
        return this.liscensePlate;
    }

    /**
    * Setter.
    *
    * @param someLiscence Liscence
    */
    public void setLiscence(String someLiscence) {
        this.liscensePlate = someLiscence;
    }

    /**
    * Air.
    */
    public void provideAir() {
        System.out.println("Provided Air.");
    }
}
