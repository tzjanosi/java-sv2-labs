package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredientsTotal;
    private List<String> ingredients=new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }
    public void addIngredients(Path path){
        readIngredients(path);
        for (int i = 2; i < ingredientsTotal.size(); i++) {
            ingredients.add(ingredientsTotal.get(i).split(" ")[2]);
        }
    }

    private void readIngredients(Path path) {
        try {
            ingredientsTotal= Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
