/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Bike class.
*/
public class Bike extends Vehicle {

    /**
    * Cadence.
    */
    private int cadence;

    /**
    * Initial values.
    *
    * @param startMaxSpeed max
    * @param startColour colour
    */

    public Bike(final int startMaxSpeed, final String startColour) {

        super(startColour, startMaxSpeed);
        cadence = 0;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getCadence() {
        return this.cadence;
    }

    /**
    * Setter.
    *
    * @param someCadence Liscence
    */
    public void setCadence(int someCadence) {
        this.cadence = someCadence;
    }

    /**
    * Bell.
    */
    public void ringBell() {
        System.out.println("Ring Ring!");
    }
}
