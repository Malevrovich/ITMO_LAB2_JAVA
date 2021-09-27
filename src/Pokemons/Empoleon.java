package Pokemons;

import Moves.FlameCharge;
import ru.ifmo.se.pokemon.Type;

public class Empoleon extends Prinplup{
    public Empoleon(String name, int level){
        super(name, level);

        addType(Type.STEEL);
        setStats(84, 86, 88, 111, 101, 60);

        addMove(new FlameCharge());
    }
}
