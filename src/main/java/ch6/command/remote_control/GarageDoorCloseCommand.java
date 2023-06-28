package ch6.command.remote_control;

public class GarageDoorCloseCommand implements Command{
    private final Door door;

    public GarageDoorCloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
        System.out.println("[Garage Close Command]");
    }
}
