package classes.receivers;

import interfaces.Light;

/**
 * Created by dnlaus on 23/08/17.
 */
public class RoofLight implements Light {

    private boolean status;

    @Override
    public void turnOn() {
        System.out.println( this.getClass().getSimpleName()+ " is on");
        status = true;
    }

    @Override
    public void turnOff() {
        System.out.println( this.getClass().getSimpleName() + " is off");
        status = false;
    }

    @Override
    public boolean getStatus() {
        return status;
    }
}
