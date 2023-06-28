package ch6.command.remote_control;

import lombok.Getter;

@Getter
public class Door {
    private String place;
    private boolean isOpen;

    public Door(String place) {
        this.place = place;
    }

    public Door(String place, boolean isOpen) {
        this.place = place;
        this.isOpen = isOpen;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }
}
