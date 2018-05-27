package Commands;

import Console.Command;
import Models.Container;

public class FindLimousine extends Command {
    public String getHelp() {
        return "Find limousine";
    }

    public String getSignature() {
        return "limousine:find";
    }

    public void handle(Container container) {
        System.out.println("Find limousine");
    }
}
