package arrays;

import java.time.YearMonth;
import java.util.Arrays;

public class ArraysMain {
    String numberOfDaysAsString(){
        int[] numberOfDays =new int[12];
        for (int i = 0; i < 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(2021, i+1);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            numberOfDays[i]=daysInMonth;
        }
        return Arrays.toString(numberOfDays);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain=new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
    }
}
