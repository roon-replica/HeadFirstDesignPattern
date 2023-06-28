package ch6.command.remote_control;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("[No Command] do nothing.");
    }
}
