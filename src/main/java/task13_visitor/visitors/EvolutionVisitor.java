package task13_visitor.visitors;

import task13_visitor.pokemons.Charizard;
import task13_visitor.pokemons.Charmander;
import task13_visitor.pokemons.Charmeleon;
import task13_visitor.pokemons.IPokemonState;

public class EvolutionVisitor implements IVisitor {
    public void visit(IPokemonState pokemon) {
        switch (pokemon) {
            case Charmander c -> {
                if (c.getPokemon().getXp() >= 100) c.changeState(new Charmeleon(c.getPokemon()));
            }
            case Charmeleon c -> {
                if (c.getPokemon().getXp() >= 1000) c.changeState(new Charizard(c.getPokemon()));
            }
            case Charizard c -> {}
        }
    }
}
