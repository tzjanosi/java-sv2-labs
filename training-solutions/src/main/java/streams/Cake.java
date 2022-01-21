package streams;

import java.util.List;

public class Cake {
    private String name;
    private List<String> ingredients;

    public Cake(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public boolean needThatIngredient(String ingredientToCheck){
        for(String ingredient:ingredients){
            if(ingredient.equals(ingredientToCheck)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
