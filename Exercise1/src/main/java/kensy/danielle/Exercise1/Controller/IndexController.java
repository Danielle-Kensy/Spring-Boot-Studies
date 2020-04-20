package kensy.danielle.Exercise1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniok
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class IndexController {

    /**
     *
     * @return a message to user.
     */
    @GetMapping("/")
    public String index() {
        return "Bem vindo Treinador!";
    }
}
