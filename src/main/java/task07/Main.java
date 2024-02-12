package task07;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        for(int i = 0; i < 3; i++) {
            player.pokemonAttack();
            player.pokemonDefend();
            player.pokemonRun();
        }
    }
}
