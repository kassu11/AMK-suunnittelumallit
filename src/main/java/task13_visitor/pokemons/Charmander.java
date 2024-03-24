package task13_visitor.pokemons;

public final class Charmander extends AbstractPokemonState implements IPokemonState {
    public Charmander(Pokemon p) {
        setPokemon(p);
    }

    @Override
    public void attack() {
        System.out.println("Charmander hyökkää, xp = " + getPokemon().getXp());
        getPokemon().setXp(getPokemon().getXp() + 1);
    }
}
