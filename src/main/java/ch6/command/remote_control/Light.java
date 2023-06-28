package ch6.command.remote_control;

import lombok.Getter;

@Getter
public class Light {
    private String place;
    private boolean isOn;

    public Light(String place) {
        this.place = place;
    }

    public Light(String place, boolean isOn) {
        this.place = place;
        this.isOn = isOn;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }
}
