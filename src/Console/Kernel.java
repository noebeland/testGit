package Console;
import java.util.ArrayList;
import Utils.Container;

public class Kernel {
    ArrayList<Command> commandLists = new ArrayList<Command>();

    public Kernel register(Command c) {
        commandLists.add(c);
        return this;
    }

    public int execute(String str) {
        Command command;
        for(int i = 0; i < commandLists.size(); i++)
        {
            command = commandLists.get(i);

            if (command.getSignature().equals(str)) {
                command.handle();
                return 1;
            }
        }

        return -1;
    }

    public String getHelp() {
        String helpMessages = "\nList of available commands\n\n";
        Command command;

        for(int i = 0; i < commandLists.size(); i++)
        {
            command = commandLists.get(i);

            helpMessages += command.getSignature() + "    " + command.getHelp() + "\n";
        }

        helpMessages += "\n";

        return helpMessages;
    }
}
