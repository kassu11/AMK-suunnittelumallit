package task11;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        for(int i = 1; i < 10; i++) {
            Player player = new Player("Player " + i);
            game.joinGame(player);
            player.start();
        }
    }
}
