package ch6.command.remote_control;

import java.util.Arrays;

public class SimpleRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slotIndex, Command onCommand, Command offCommand) {
        onCommands[slotIndex] = onCommand;
        offCommands[slotIndex] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n---리모컨---\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot-")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append(" | ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }

        return stringBuilder.toString();
    }
}
