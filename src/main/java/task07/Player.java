package task07;

public class Player {
    PokemonConnection pokemon;

    public Player() {
        this.pokemon = new PokemonConnection(new Charmander());
    }

    public void pokemonAttack() {
        pokemon.attack();
    }

    public void pokemonDefend() {
        pokemon.defend();
    }

    public void pokemonRun() {
        pokemon.speed();
    }
}
