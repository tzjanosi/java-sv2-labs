package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> inputList){
        List<String> transformedList = new ArrayList<>();
        for(int i=0; i< inputList.size();i++){
            transformedList.add(inputList.get(i).substring(0, 2));
        }
        return transformedList;
    }
}
