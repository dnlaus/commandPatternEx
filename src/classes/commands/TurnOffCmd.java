package classes.commands;

import interfaces.Command;
import interfaces.Light;

/**
 * Created by dnlaus on 23/08/17.
 */
public class TurnOffCmd implements Command{
    private Light light;

    public TurnOffCmd(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        if(light.getStatus()){
            light.turnOff();
        }else{
            System.out.println("The "+light.getClass().getSimpleName()+" is alredy OFF");
        }
    }
}
