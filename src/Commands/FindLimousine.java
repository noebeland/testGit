package Commands;

import Console.Command;

public class FindLimousine extends Command {
    public String getHelp() {
        return "Find limousine";
    }

    public String getSignature() {
        return "find:limousine";
    }

    public void handle() {
        System.out.println("do stuff");
    }
}
