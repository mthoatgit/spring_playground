package de.mth.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
