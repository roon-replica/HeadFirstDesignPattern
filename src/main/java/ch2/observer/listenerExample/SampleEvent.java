package ch2.observer.listenerExample;

import org.springframework.context.ApplicationEvent;

public class SampleEvent extends ApplicationEvent {
    private String msg;

    public SampleEvent(Object msg) {
        super(msg);
        this.msg = msg.toString();
    }

    @Override
    public String toString() {
        return msg;
    }
}