package classes.client;

import classes.commands.TurnOffCmd;
import classes.commands.TurnOnCmd;
import classes.enums.CommandType;
import classes.receivers.Lamp;
import classes.receivers.RoofLight;
import interfaces.Command;
import interfaces.Light;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dnlaus on 23/08/17.
 */
public class Switch {

    private HashMap<CommandType, Command> commands;
    private LinkedList<CommandType> executedCommands;

    public Switch(){
        registerCommands();
    }

    private void registerCommands(){
        commands = new HashMap<>();
        executedCommands = new LinkedList<>();
        Light lamp = new Lamp();
        Light roofLight = new RoofLight();

        commands.put(CommandType.TURN_ON_LAMP, new TurnOnCmd(lamp));
        commands.put(CommandType.TURN_OFF_LAMP, new TurnOffCmd(lamp));
        commands.put(CommandType.TURN_ON_ROOF_LIGHT, new TurnOnCmd(roofLight));
        commands.put(CommandType.TURN_OFF_ROOF_LIGHT, new TurnOffCmd(roofLight));
    }

    public void executeCommand(CommandType commandType){
        commands.get(commandType).execute();
        executedCommands.add(commandType);
    }
}
