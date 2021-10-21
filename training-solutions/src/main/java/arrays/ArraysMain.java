package arrays;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;

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
    void multiplicationTableAsString(int size){
        int[] innerArray;
        int[][] multiplicationTable=new int[size+1][size+1];
        int multiplicatorI;
        int multiplicatorJ;
        for (int i = 0; i < size+1; i++) {
            innerArray= new int[size+1];
            multiplicatorI=(i==0?1:i);
            for (int j = 0; j < size+1; j++) {
                multiplicatorJ=(j==0?1:j);
                innerArray[j]=multiplicatorI*multiplicatorJ;
            }
            if(i==0){
                innerArray[0]=0;
            }
            multiplicationTable[i]=innerArray;
            System.out.println(Arrays.toString(innerArray));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArraysMain arraysMain=new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println();
        System.out.println("Type in the size of multiplication table:");
        int size=scanner.nextInt();
        arraysMain.multiplicationTableAsString(size);
    }
}
