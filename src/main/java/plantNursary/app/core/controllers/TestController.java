package plantNursary.app.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String getMethodName() {
        return "hello!";
    }
    
}
