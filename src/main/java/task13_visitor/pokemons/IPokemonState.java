package task13_visitor.pokemons;

public sealed interface IPokemonState permits AbstractPokemonState, Charmander, Charmeleon, Charizard {
    void attack();
}
