package task13_visitor.visitors;

import task13_visitor.pokemons.IPokemonState;

public interface IVisitor {
    void visit(IPokemonState p);
}
