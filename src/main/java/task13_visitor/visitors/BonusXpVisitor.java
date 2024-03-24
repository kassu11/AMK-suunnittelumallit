package task13_visitor.visitors;

import task13_visitor.pokemons.Charizard;
import task13_visitor.pokemons.Charmander;
import task13_visitor.pokemons.Charmeleon;
import task13_visitor.pokemons.IPokemonState;

public class BonusXpVisitor implements IVisitor {
    public void visit(IPokemonState pokemon) {
        switch (pokemon) {
            case Charmander c -> {
                if (c.getPokemon().getXp() >= 5) c.getPokemon().setXp(c.getPokemon().getXp() + 5);
            }
            case Charmeleon c -> {
                if (c.getPokemon().getXp() >= 100) c.getPokemon().setXp(c.getPokemon().getXp() + 50);
            }
            case Charizard c -> {
                if (c.getPokemon().getXp() >= 500) c.getPokemon().setXp(c.getPokemon().getXp() + 100);
            }
        }
    }
}
