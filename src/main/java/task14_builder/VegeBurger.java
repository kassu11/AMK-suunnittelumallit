package task14_builder;

public class VegeBurger {
    private String bun;
    private String topping;
    private String steak;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSteak(String steak) {
        this.steak = steak;
    }

    public String toString() {
        return bun + "\n" + steak + "\n" + topping + "\n" + bun;
    }
}
