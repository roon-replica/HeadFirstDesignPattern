package ch5.singleton.using_enum;

import lombok.Getter;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@Getter
public enum SingletonEnum {
    INSTANCE;

    RestTemplate restTemplate; // private default

    SingletonEnum() {
        this.restTemplate = new RestTemplateBuilder().build();
    }
}
