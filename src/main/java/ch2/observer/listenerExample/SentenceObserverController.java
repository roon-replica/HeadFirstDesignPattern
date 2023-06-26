package ch2.observer.listenerExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceObserverController {
    private final SampleEventPublisher publisher;

    public SentenceObserverController(SampleEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/ch2/observer/sentence")
    public void test(String message) {
        publisher.publish(message);
    }
}
