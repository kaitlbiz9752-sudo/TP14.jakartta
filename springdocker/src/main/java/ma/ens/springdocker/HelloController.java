package ma.ens.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Bonjour depuis Spring Boot dans Docker (bientôt) !";
    }
}
