import Pokemons.Patrat;
import Pokemons.Watchog;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import Pokemons.Relicanth;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Watchog w = new Watchog("Watchog", 1);
        Patrat p = new Patrat("Patrat", 1);

        Relicanth r = new Relicanth("Relicanth", 1);

        b.addFoe(p);
        b.addFoe(w);

        b.addAlly(r);

        b.go();
    }
}
