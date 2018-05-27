package Console;

public abstract class Command {
    public abstract String getHelp();
    public abstract void handle();
    public abstract String getSignature();
}
