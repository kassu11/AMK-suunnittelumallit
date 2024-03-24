package task13_visitor.pokemons;

public final class Charizard extends AbstractPokemonState implements IPokemonState {
    public Charizard(Pokemon p) {
        setPokemon(p);
    }

    @Override
    public void attack() {
        System.out.println("Charizard hyökkää, xp = " + getPokemon().getXp());
        getPokemon().setXp(getPokemon().getXp() + 50);
    }
}
