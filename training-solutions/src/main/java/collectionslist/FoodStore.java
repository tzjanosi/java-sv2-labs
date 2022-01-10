package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {
    private List<Food> foodList=new LinkedList<>();

    public void addFood(Food food){
        foodList.add(food);
    }

    public void sellFirst(Food food){
        if(food.getExpirationDate().equals(LocalDate.now())){
            foodList.add(0,food);
        }
    }

    public List<Food> getFoods() {
        return foodList;
    }
}
