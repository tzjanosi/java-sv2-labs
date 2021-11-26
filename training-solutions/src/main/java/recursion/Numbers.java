package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers){
        int length=numbers.length;
        if(length<=1){
            if(length==1){
                return numbers[0];
            }
            else{
                return 0;
            }
        }
        else{
            return getSum(Arrays.copyOfRange(numbers, 0, length-1))+numbers[length-1];
        }
    }
}
