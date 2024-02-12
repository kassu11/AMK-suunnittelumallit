package task07;

public class Charizard extends PokemonState {

    public Charizard() {
        super("Charizard", 0, 20, 100, 80, 70, 60);
    }

    public void attack(PokemonConnection connection) {
        super.attack(connection);
        addXp(connection, 10);
    }

    public void defend(PokemonConnection connection) {
        super.defend(connection);
        addXp(connection, 5);
    }

    public void speed(PokemonConnection connection) {
        super.speed(connection);
        addXp(connection, 5);
    }

    public void health(PokemonConnection connection) {
        super.health(connection);
        addXp(connection, 5);
    }

    public void addXp(PokemonConnection connection, int xp) {
        this.xp += xp;
        if (this.xp >= nextLevelXp) {
            System.out.println("Charizard is already at max level!");
        }
    }
}
