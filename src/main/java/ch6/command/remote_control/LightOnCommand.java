package ch6.command.remote_control;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.printf("Is %s light on? %s \n", light.getPlace(), (light.isOn() ? "yes" : "no"));
    }
}
