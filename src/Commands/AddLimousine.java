package Commands;

import Console.Command;
import Models.Container;
import Models.Limousine;

public class AddLimousine extends Command {
    public String getHelp() {
        return "Add a limousine";
    }

    public String getSignature() {
        return "limousine:add";
    }

    public void handle(Container container) {
        try {
            System.out.println("registration number of the limousine:");
            int registrationNumber = container.getScanner().nextInt();

            System.out.println("color of the limousine:");
            String color = container.getScanner().nextLine();

            System.out.println("tank capacity of the limousine:");
            int tankCapacity = container.getScanner().nextInt();

            System.out.println("passenger capacity of the limousine:");
            int passengerCapacity = container.getScanner().nextInt();

            Limousine limousine = new Limousine(registrationNumber, tankCapacity, passengerCapacity, color);
            container.getCompany().addLimousine(limousine);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
