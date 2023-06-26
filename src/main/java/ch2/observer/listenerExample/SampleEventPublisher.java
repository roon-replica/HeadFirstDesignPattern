package ch2.observer.listenerExample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SampleEventPublisher {
    private final ApplicationEventPublisher publisher;

    public SampleEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish(final String message) {
        System.out.println("publishing event...");
        SampleEvent event = new SampleEvent(message);
        publisher.publishEvent(event);
    }
}
