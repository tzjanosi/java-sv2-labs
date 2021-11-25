package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer>habitantsNumbersList, int limit){
        for(int numberOfHabitants:habitantsNumbersList){
            if(numberOfHabitants<limit){
                return true;
            }
        }
    return false;
    }
}
