package task14_builder;

public interface BurgeriBuilder {
    void createNewBurger();

    void buildBun();

    void buildTopping();

    void buildSteak();
    Object getBurger();
}
