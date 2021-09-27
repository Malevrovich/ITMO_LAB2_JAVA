package Pokemons;

import Moves.Confide;
import Moves.DoubleTeam;
import Moves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Patrat extends Pokemon {
    public Patrat(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(45, 55, 39, 35, 39, 42);

        setMove(new Facade(), new Confide(), new DoubleTeam());
    }
}
