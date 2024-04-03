package task14_builder;

public class CashierWorker {
    private BurgeriBuilder burgeriBuilder;

    public void setBurgeriBuilder(BurgeriBuilder burgeriBuilder) {
        this.burgeriBuilder = burgeriBuilder;
    }

    public void constructBurger() {
        burgeriBuilder.createNewBurger();
        burgeriBuilder.buildBun();
        burgeriBuilder.buildTopping();
        burgeriBuilder.buildSteak();
        burgeriBuilder.buildBun();
    }

    public Object getBurger() {
        return burgeriBuilder.getBurger();
    }
}
