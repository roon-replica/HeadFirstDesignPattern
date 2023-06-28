package ch6.command.remote_control;

public class SimpleRemoteControlDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("livingRoom");
        Light bedRoomLight = new Light("bedRoom");
        Door garageDoor = new Door("garage");

        Command noCommand = new NoCommand();
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOnCommand, noCommand);
        remoteControl.pushOnButton(0);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(1, garageDoorOpenCommand, noCommand);
        remoteControl.pushOnButton(1);

        System.out.println(remoteControl);
    }
}
