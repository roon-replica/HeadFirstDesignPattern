package ch2.observer.listenerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentenceApplication.class, args);

        // badListener, goodListener가 옵저버겠지
        // ApplicationListener<SampleEvent>가 옵저버 인터페이스일거고
        // sampleEventPublisher가 subject
        // 근데 observer를 추가,삭제하는 기능은 없고 전달만 가능한
        // 좀 다른건가..?

    }
}
