package task13_visitor.pokemons;

public final class Charmeleon extends AbstractPokemonState implements IPokemonState {
    public Charmeleon(Pokemon p) {
        setPokemon(p);
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon hyökkää, xp = " + getPokemon().getXp());
        getPokemon().setXp(getPokemon().getXp() + 10);
    }
}
