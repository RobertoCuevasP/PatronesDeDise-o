package command;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<IComando> commandList = new ArrayList<>();

    public void setCommand(IComando command){
        this.commandList.add(command);
    }

    public void runCommand(){
        for (IComando command:this.commandList) {
            command.ejecutar();
        }
        commandList.clear();
    }

}
