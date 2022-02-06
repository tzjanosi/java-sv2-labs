package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String input){
        return (input==null || input.trim().isEmpty());
    }
    public static boolean isEmpty(List inputList){
        return inputList==null || inputList.isEmpty() || inputList.size()==0;
    }
}
