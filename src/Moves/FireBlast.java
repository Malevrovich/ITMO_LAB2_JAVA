package Moves;

import java.util.Random;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if(new Random().nextDouble() < 0.1) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "применяет FireBlast";
    }
}
