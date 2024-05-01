package task22_command;

public class Main {
    public static void main(String[] args) {
        Valkokangas valkokangas = new Valkokangas();
        Command switchCommand = new SwitchCommand(valkokangas);
        WallSwitch wallSwitch = new WallSwitch(switchCommand);

        wallSwitch.toggle();
        wallSwitch.toggle();
        wallSwitch.toggle();
    }
}
