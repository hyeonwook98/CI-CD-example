package CD.CD.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "CI/CD 동작확인 드뎌 성공인가..";
    }
}
