package ch6.command.remote_control;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println("[Light Off Command]");
    }
}
