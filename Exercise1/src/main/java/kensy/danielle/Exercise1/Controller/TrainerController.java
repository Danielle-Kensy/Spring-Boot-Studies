package kensy.danielle.Exercise1.Controller;
import kensy.danielle.Exercise1.Model.Trainer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Daniok
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class TrainerController {

    /**
     *
     * @return the register of one trainer
     */
    @GetMapping("/trainer")
    public Trainer getTrainer() {
        Trainer  trainer = new Trainer();
        trainer.setName("Dani");
        trainer.setAge(17);
        return trainer;
    }

    /**
     *
     * @return a list of register of trainers
     */
    @GetMapping("/listtrainers")
    public ArrayList<Trainer> getTrainers() {
        Trainer trainer1 = new Trainer();
        trainer1.setName("Henrique");
        trainer1.setAge(19);

        Trainer trainer2 = new Trainer();
        trainer2.setName("Dani");
        trainer2.setAge(17);

        ArrayList<Trainer> trainers = new ArrayList<>();
        trainers.add(trainer1);
        trainers.add(trainer2);

        return trainers;
    }
}
