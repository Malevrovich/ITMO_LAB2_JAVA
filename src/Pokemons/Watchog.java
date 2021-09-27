package Pokemons;

import Moves.RockSlide;

public class Watchog extends Patrat{
    public Watchog(String name, int level) {
        super(name, level);
        setStats(60, 85, 69, 60, 69, 77);

        addMove(new RockSlide());
    }
}
