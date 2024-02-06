package task05;

public class Enemy {
    private int hp;
    private String name;

    public Enemy(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }


    public void attack() {
        System.out.println(name + " attacks!");
        Player.getInstance().setHp(Player.getInstance().getHp() - (int)(Math.random() * 5) - 3);
    }
}
