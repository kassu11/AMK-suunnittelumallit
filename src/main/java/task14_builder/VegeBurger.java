package task14_builder;

public class VegeBurger {
    private StringBuilder ingredients = new StringBuilder();

    public void setBun(String bun) {
        ingredients.append(bun).append("\n");
    }

    public void setTopping(String topping) {
        ingredients.append(topping).append("\n");
    }

    public void setSteak(String steak) {
        ingredients.append(steak).append("\n");
    }

    public String toString() {
        return ingredients.toString();
    }
}
