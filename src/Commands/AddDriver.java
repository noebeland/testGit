package Commands;

import Console.Command;
import Models.Driver;
import Models.Container;

public class AddDriver extends Command {
    public String getHelp() {
        return "Add a driver";
    }

    public String getSignature() {
        return "driver:add";
    }

    public void handle(Container container) {
        System.out.println("Add a driver");
        Driver driver = new Driver("Beland", "Noemie", "1161 chemin du lac-des-piles",2018);
        container.getCompany().addDriver(driver);
    }
}
