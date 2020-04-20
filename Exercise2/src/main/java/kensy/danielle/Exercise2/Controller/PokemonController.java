package kensy.danielle.Exercise2.Controller;

import kensy.danielle.Exercise2.Model.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Daniok
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class PokemonController {

    /**
     *
     * @return the register of one pokemon
     */
    @GetMapping("/pokemon")
    public Pokemon getPokemon() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("Pikachu");
        pokemon.setType("Elétrico");
        return pokemon;
    }

    /**
     *
     * @return a list of register of pokemons
     */
    @GetMapping("/listpokemons")
    public ArrayList<Pokemon> getPokemons() {
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pikachu");
        pokemon1.setType("Elétrico");

        Pokemon pokemon2 = new Pokemon();
        pokemon2.setName("Bulbasaur");
        pokemon2.setType("Plant");

        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(pokemon1);
        pokemons.add(pokemon2);

        return pokemons;
    }
}
