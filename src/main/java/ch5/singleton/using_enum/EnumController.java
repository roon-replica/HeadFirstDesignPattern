package ch5.singleton.using_enum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnumController {
    private SingletonEnum instance = SingletonEnum.INSTANCE;

    @GetMapping("/ch5/enum/dummy")
    public String dummy() {
        return "dummy";
    }

    @GetMapping("/demo")
    public String demo(){
        String dummyData = instance.restTemplate.getForEntity("http://localhost:8080/ch5/enum/dummy", String.class).getBody();
        return dummyData;
    }


}
