package ch6.command.remote_control;

public class GarageDoorOpenCommand implements Command {
    private final Door door;

    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
        System.out.printf("Is %s door open? %s \n", door.getPlace(), (door.isOpen() ? "yes" : "no"));
    }
}
