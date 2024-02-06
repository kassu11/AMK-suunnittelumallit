package task05;

public class Player {
    private static Player instance;
    private int hp;
    private int mp;

    private Player() {
        this.hp = 100;
        this.mp = 50;
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
