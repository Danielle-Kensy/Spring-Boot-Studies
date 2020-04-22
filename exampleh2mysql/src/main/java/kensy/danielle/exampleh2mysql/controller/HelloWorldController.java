package kensy.danielle.exampleh2mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniok
 * @since 22/04/2020
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Seja Bem vindo ao sistema!";
    }
}
