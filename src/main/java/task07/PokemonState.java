package task07;

public abstract class PokemonState {
    protected String name;
    protected int xp;
    protected int nextLevelXp;
    protected int hp;
    protected int defense;
    protected int speed;
    protected int damage;

    public PokemonState(String name, int xp, int nextLevelXp, int hp, int defense, int speed, int damage) {
        this.name = name;
        this.xp = xp;
        this.nextLevelXp = nextLevelXp;
        this.hp = hp;
        this.defense = defense;
        this.speed = speed;
        this.damage = damage;
    }
    public void attack(PokemonConnection connection) {
        System.out.printf("%s attacks! Damage: %d\n", name, damage);
    }

    public void defend(PokemonConnection connection) {
        System.out.printf("%s defends! Defense: %d\n", name, damage);
    }

    public void speed(PokemonConnection connection) {
        System.out.printf("%s speeds up! Speed: %d\n", name, damage);
    }

    public void health(PokemonConnection connection) {
        System.out.printf("%s heals! HP: %d\n", name, damage);
    }

    protected void changeState(PokemonConnection connection, PokemonState state) {
        connection.changeState(state);
    }
}
