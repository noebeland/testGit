package Commands;

import Console.Command;
import Models.Container;

public class RentLimousine extends Command {
    public String getHelp() {
        return "Rent a limousine";
    }

    public String getSignature() {
        return "limousine:rent";
    }

    public void handle(Container container) {
        System.out.println("Rent a limousine");
    }
}
