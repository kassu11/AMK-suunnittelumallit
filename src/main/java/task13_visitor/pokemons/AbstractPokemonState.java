package task13_visitor.pokemons;

public abstract sealed class AbstractPokemonState implements IPokemonState permits Charmander, Charmeleon, Charizard {
    private Pokemon pokemon;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void changeState(IPokemonState newState) {
        pokemon.changeState(newState);
    }
}
