package task14_builder;

import task14_builder.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class BeefBurger {
    private List<Ingredient> ingredients = new ArrayList<>();

    public void setSteak(Ingredient steak) {
        ingredients.add(steak);
    }

    public void setTopping(Ingredient topping) {
        ingredients.add(topping);
    }

    public void setBun(Ingredient bun) {
        ingredients.add(bun);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient.getIngredient());
            sb.append("\n");
        }
        return sb.toString();
    }
}
