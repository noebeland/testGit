import java.util.Scanner;
import Console.Kernel;
import Commands.FindLimousine;

public class Main {

    public static void main(String[] args)
    {
        //test
        Driver d1 = new Driver("Beland", "Noemie", "1161 chemin du lac-des-piles",2018);
        System.out.println(d1);

        Kernel kernel = new Kernel();
        kernel.register(new FindLimousine());

        Scanner scanner = new Scanner(System.in);

        String command;
        while(true) {
            System.out.println(kernel.getHelp() + "Or write exit to terminate the program\n");
            System.out.println("Enter your command: ");
            command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("good bye");
                return;
            }

            kernel.execute(command);
        }
    }
}
