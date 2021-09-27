package Pokemons;

import Moves.WildCharge;

public class Prinplup extends Piplup{
    public Prinplup(String name, int level){
        super(name, level);

        setStats(64, 66, 68, 81, 76, 50);

        addMove(new WildCharge());
    }
}
