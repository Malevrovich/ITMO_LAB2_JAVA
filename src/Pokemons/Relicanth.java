package Pokemons;

import Moves.FireBlast;
import Moves.FlameCharge;
import Moves.QuickAttack;
import Moves.ScaryFace;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Relicanth extends Pokemon{
    public Relicanth(String name, int level){
        super(name, level);
        setType(Type.WATER, Type.ROCK);
        setStats(100, 90, 130, 45, 65, 55);

        setMove(new QuickAttack(), new FireBlast(), new ScaryFace(), new FlameCharge());
    }
}
