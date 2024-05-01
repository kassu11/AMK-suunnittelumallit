package task22_command;

public class WallSwitch {
    private final Command command;

    public WallSwitch(Command command) {
        this.command = command;
    }

    public void toggle() {
        command.execute();
    }
}
