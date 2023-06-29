package ch6.command.remote_control;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SimpleRemoteControlDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("livingRoom");
        Light bedRoomLight = new Light("bedRoom");
        Door garageDoor = new Door("garage");

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Runnable noCommand = () -> System.out.println("[No Command]");

        // 커맨드 객체를 따로 안만들고 execute()가 수행할 동작을 넘겨주는 방식!! (함수 객체를 넘겨주는)
        // 그럼 구체 커맨드 객체를 안만들어도 됨!!
        remoteControl.setCommand(0, livingRoomLight::on, noCommand::run);
        remoteControl.pushOnButton(0);
        System.out.println(livingRoomLight.isOn());

        remoteControl.setCommand(1, bedRoomLight::on, noCommand::run);
        System.out.println(bedRoomLight.isOn());

        remoteControl.setCommand(1, garageDoor::open, noCommand::run);
        remoteControl.pushOnButton(1);
        System.out.println(garageDoor.isOpen());

        System.out.println(remoteControl);
    }
}
