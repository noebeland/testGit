import Commands.AddDriver;
import Commands.RentLimousine;
import Commands.ShowRides;
import Console.Kernel;
import Commands.FindLimousine;
import Models.Company;
import Models.Container;

public class Main {

    public static void main(String[] args)
    {
        Company company = new Company();
        Container container = new Container(company);

        //test
//        Driver d1 = new Driver("Beland", "Noemie", "1161 chemin du lac-des-piles",2018);
//        System.out.println(d1);

        Kernel kernel = new Kernel(container);
        kernel.register(new FindLimousine())
              .register(new RentLimousine())
              .register(new ShowRides())
              .register(new AddDriver());

        String command;
        while(true) {
            System.out.println(kernel.getHelp() + "Or write exit to terminate the program\n");
            System.out.println("Enter your command: ");
            command = container.getScanner().nextLine();

            if (command.equals("exit")) {
                System.out.println("good bye");
                return;
            }

            kernel.execute(command);
        }
    }
}
