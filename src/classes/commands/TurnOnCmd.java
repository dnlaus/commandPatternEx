package classes.commands;

import interfaces.Command;
import interfaces.Light;

/**
 * Created by dnlaus on 23/08/17.
 */
public class TurnOnCmd implements Command{
    private Light light;

    public TurnOnCmd(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        if(!light.getStatus()){
            light.turnOn();
        }else{
            System.out.println("The "+light.getClass().getSimpleName()+" is alredy ON");
        }
    }
}
