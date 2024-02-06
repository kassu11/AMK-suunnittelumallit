package task05;

public class Main {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Enemy 1", 10);
        Enemy enemy2 = new Enemy("Enemy 2", 10);
        Player player = Player.getInstance();

        for (int i = 0; i < 5; i++) {
            enemy1.attack();
            System.out.println("Player HP: " + player.getHp());
            enemy2.attack();
            System.out.println("Player HP: " + player.getHp());
        }
    }
}
