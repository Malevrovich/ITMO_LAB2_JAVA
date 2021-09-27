package Pokemons;

import Moves.DoubleTeam;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Piplup extends Pokemon {
    public Piplup(String name, int level){
        super(name, level);

        setType(Type.WATER);
        setStats(53, 51, 53, 61, 56, 40);

        setMove(new DoubleTeam(), new Swagger());
    }
}
