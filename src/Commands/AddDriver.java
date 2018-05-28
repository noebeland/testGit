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
        try {
            System.out.println("first name of driver:");
            String firstName = container.getScanner().nextLine();
            System.out.println("last name of driver:");
            String lastName = container.getScanner().nextLine();
            System.out.println("address of driver:");
            String address = container.getScanner().nextLine();
            System.out.println("year of hiring:");
            int yearHiring = container.getScanner().nextInt();
            Driver driver = new Driver(lastName, firstName, address, yearHiring);
            container.getCompany().addDriver(driver);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
