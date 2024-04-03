package task14_builder;

public class HesburgerBuilder implements BurgeriBuilder {
    private VegeBurger burgeri;

    public void createNewBurger() {
        burgeri = new VegeBurger();
    }

    public void buildBun() {
        burgeri.setBun("Bad bun");
    }

    public void buildTopping() {
        burgeri.setTopping("Tomato");
    }

    public void buildSteak() {
        burgeri.setSteak("Vege steak");
    }

    public Object getBurger() {
        return burgeri;
    }
}
