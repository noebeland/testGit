package Commands;

import Console.Command;
import Models.Driver;
import Models.Container;

public class ShowRides  extends Command {
    public String getHelp() {
        return "Show all rides with associated Driver";
    }

    public String getSignature() {
        return "rides:show";
    }

    public void handle(Container container) {
        System.out.println(container.getCompany().showAllDrivers());
    }
}
