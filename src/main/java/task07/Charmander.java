package task07;

public class Charmander extends PokemonState {

    public Charmander() {
        super("Charmander", 0,20,100,10,10,10);
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
            System.out.printf("%s is evolving!\n", name);
            connection.changeState(new Charmeleon());
        }
    }
}
