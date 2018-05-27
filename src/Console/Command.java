package Console;
import Models.Container;

public abstract class Command {
    public abstract String getHelp();
    public abstract void handle(Container container);
    public abstract String getSignature();
}
