package Moves;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove {
    public ScaryFace(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().turns(2).stat(Stat.SPEED, -2).attack(1));
    }

    @Override
    protected String describe() {
        return "применяет Scary Face";
    }
}
