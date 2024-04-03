package task14_builder;

import task14_builder.ingredients.Beefsteak;
import task14_builder.ingredients.GoodBun;
import task14_builder.ingredients.Salad;

public class McDonaldsBuilder implements BurgeriBuilder {
    private BeefBurger burgeri;
    public void createNewBurger() {
        burgeri = new BeefBurger();
    }

    public void buildBun() {
        burgeri.setBun(new GoodBun());
    }

    public void buildTopping() {
        burgeri.setTopping(new Salad());
    }

    public void buildSteak() {
        burgeri.setSteak(new Beefsteak());
    }

    public BeefBurger getBurger() {
        return burgeri;
    }
}
