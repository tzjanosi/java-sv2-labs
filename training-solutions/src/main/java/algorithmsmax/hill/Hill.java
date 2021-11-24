package algorithmsmax.hill;

import java.util.Arrays;
import java.util.List;

public class Hill {
    public int getMax(List<Integer> heightList){
        int max=heightList.get(0);
        for(int height:heightList){
            if(height>max){
                max=height;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Hill hill=new Hill();
        List<Integer> heightList= Arrays.asList(1200,2400,3000,1600,800);
        System.out.println("All values:"+heightList);
        System.out.println("Max value:"+hill.getMax(heightList));
    }
}
