package Moves;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    public FlameCharge(){
        super(Type.FIRE, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.SPEED, 1).turns(1));
    }

    @Override
    protected String describe() {
        return "применяет FlameCharge";
    }
}
