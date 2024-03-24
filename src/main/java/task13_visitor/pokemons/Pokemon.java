package task13_visitor.pokemons;

import task13_visitor.visitors.EvolutionVisitor;
import task13_visitor.visitors.IVisitor;

public class Pokemon {
    private int xp = 0;
    private IPokemonState state;
    private final IVisitor evolutionVisitor;

    public Pokemon() {
        state = new Charmander(this);
        evolutionVisitor = new EvolutionVisitor();
    }

    public void changeState(IPokemonState newState) {
        System.out.printf("Onnittelut \"%s\" saavutti evoluution \"%s\"\n\n", state.getClass().getSimpleName(), newState.getClass().getSimpleName());
        state = newState;
    }

    public void setXp(int xp) {
        this.xp = xp;
        evolutionVisitor.visit(state);
    }

    public int getXp() {
        return xp;
    }

    public void attack() {
        state.attack();
    }

    public void accept(IVisitor v) {
        v.visit(state);
    }
}
