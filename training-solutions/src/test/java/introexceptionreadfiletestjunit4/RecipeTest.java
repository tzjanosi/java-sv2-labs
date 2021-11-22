package introexceptionreadfiletestjunit4;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeTest {
    Recipe recipe;

    @Before
    public void setUp() {
        recipe=new Recipe();
    }
    @Test
    public void testRecipeOK() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        List<String> ingredientsList=recipe.getIngredients();
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor","tojás","citrom","sütőpor","vanillincukor","tejföl","alma","fahéj"), ingredientsList);
    }
    @Test
    public void testRecipeNOK() {
        recipe.addIngredients(Paths.get("src/test/resources/recipeNOK.txt"));
        List<String> ingredientsList=recipe.getIngredients();
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor","tojás","citrom","sütőpor","vanillincukor","tejföl","alma","fahéj"), ingredientsList);
    }
}