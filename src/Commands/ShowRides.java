package Commands;

import Console.Command;
import Utils.Container;

public class ShowRides  extends Command {
    public String getHelp() {
        return "Show all rides with associated Driver";
    }

    public String getSignature() {
        return "rides:show";
    }

    public void handle() {
        System.out.println(Container.getInstance().getCompany().showAllDrivers());
    }
}
