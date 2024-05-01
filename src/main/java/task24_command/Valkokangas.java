package task24_command;

public class Valkokangas {
    private boolean up = false;

    public void setUp() {
        System.out.println("Valkokangas on ylhäällä");
        up = true;
    }
    public void turnDown() {
        System.out.println("Valkokangas on alhaalla");
        up = false;
    }

    public boolean isUp() {
        return up;
    }
}
