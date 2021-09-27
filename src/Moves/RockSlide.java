package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(new Random().nextDouble() < 0.3){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "применяет Rock Slide";
    }
}
