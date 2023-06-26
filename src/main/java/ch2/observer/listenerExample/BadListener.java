package ch2.observer.listenerExample;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BadListener implements ApplicationListener<SampleEvent> {
    @Override
    public void onApplicationEvent(SampleEvent event) {
        System.out.println("[bad listener]" + event);
    }
}
