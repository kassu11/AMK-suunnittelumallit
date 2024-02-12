package task07;

public class PokemonConnection {
    private PokemonState state;

    public PokemonConnection(PokemonState state) {
        this.state = state;
    }

    public void attack() {
        state.attack(this);
    }

    public void defend() {
        state.defend(this);
    }

    public void speed() {
        state.speed(this);
    }

    public void health() {
        state.health(this);
    }

    protected void changeState(PokemonState state) {
        this.state = state;
    }
}
