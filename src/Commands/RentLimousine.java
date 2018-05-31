package Commands;

import Console.Command;
import Utils.Container;

public class RentLimousine extends Command {
    public String getHelp() {
        return "Rent a limousine";
    }

    public String getSignature() {
        return "limousine:rent";
    }

    public void handle() {
        System.out.println("Rent a limousine");
    }
}
