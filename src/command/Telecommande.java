package command;

import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    //Command command;
    List<Command> commands;

    public Telecommande() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void invoquer(){
        for (Command command:commands) {
            command.execute();
        }
    }

    public void annuler(){
        for (Command command:commands) {
            command.undo();
        }
    }

}
