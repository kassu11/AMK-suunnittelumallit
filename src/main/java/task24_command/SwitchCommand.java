package task24_command;

public class SwitchCommand implements Command {
    private final Valkokangas valkokangas;

    public SwitchCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() {
        if (valkokangas.isUp()) {
            valkokangas.turnDown();
        } else {
            valkokangas.setUp();
        }
    }
}
