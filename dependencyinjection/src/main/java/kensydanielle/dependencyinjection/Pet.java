package kensydanielle.dependencyinjection;

import kensydanielle.dependencyinjection.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author daniok
 * @since 16/04/2020
 * @version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private IAnimal iAnimal;

    public void execute() {
        iAnimal.comunicar();
    }

}
