package Commands;

import Console.Command;
import Models.Container;
import Models.Driver;

public class FindLimousine extends Command {
    public String getHelp() {
        return "Find limousine";
    }

    public String getSignature() {
        return "limousine:find";
    }

    public void handle(Container container) {
        System.out.println("enter the driver first name you would like to search: ");
        String driverFirstName = container.getScanner().nextLine();

        System.out.println("enter the driver last name you would like to search: ");
        String driverLastName = container.getScanner().nextLine();
        Driver driver = container.getCompany().findDriverByName(driverFirstName, driverLastName);

        if (driver == null) {
            System.out.println("no driver found with your criteria");
            return;
        }
        System.out.println(driver.getFormattedRides());
    }
}
