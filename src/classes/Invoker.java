package classes;

import classes.client.Switch;
import classes.enums.CommandType;

/**
 * Created by dnlaus on 23/08/17.
 */
public class Invoker {

    public static void main(String... args){
        Switch lightSwitch = new Switch();

        lightSwitch.executeCommand(CommandType.TURN_ON_LAMP);
        lightSwitch.executeCommand(CommandType.TURN_ON_LAMP);
        lightSwitch.executeCommand(CommandType.TURN_OFF_LAMP);
        lightSwitch.executeCommand(CommandType.TURN_OFF_LAMP);
        lightSwitch.executeCommand(CommandType.TURN_ON_ROOF_LIGHT);
        lightSwitch.executeCommand(CommandType.TURN_ON_ROOF_LIGHT);
        lightSwitch.executeCommand(CommandType.TURN_OFF_ROOF_LIGHT);
        lightSwitch.executeCommand(CommandType.TURN_OFF_ROOF_LIGHT);
        lightSwitch.executeCommand(CommandType.TURN_OFF_ROOF_LIGHT);
        lightSwitch.executeCommand(CommandType.TURN_ON_LAMP);
        lightSwitch.executeCommand(CommandType.TURN_OFF_LAMP);
    }

}
