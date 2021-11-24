package algorithmsmax.temperature;

import java.util.Arrays;
import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperatureList){
        int min=temperatureList.get(0);
        for(int temperature:temperatureList){
            if(temperature<min){
                min=temperature;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Temperature temperature=new Temperature();
        List<Integer> temperatureList= Arrays.asList(1,2,3,-1,0);
        System.out.println("All values:"+temperatureList);
        System.out.println("Min value:"+temperature.getMin(temperatureList));
    }
}
