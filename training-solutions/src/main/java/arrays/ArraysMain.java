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

    boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    int min(int a, int b){
        if(a<=b){
            return a;
        }
        else{
            return b;
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

        System.out.println();
        double[] day = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        double[] anotherDay = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        System.out.println("Values for day#1: "+ Arrays.toString(day));
        System.out.println("Values for day#2: "+ Arrays.toString(anotherDay));
        if (arraysMain.sameTempValues(day,anotherDay)){
            System.out.println("The values are matched.");
        }
        else{
            System.out.println("The values are different.");
        }
        System.out.println();
        double[] day2 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.7};
        double[] anotherDay2 = {4.1,7.2,9.0,3.9,3.7,2.8,1.7,1.1,2.0,-3.6,1.5,2.7,2.0,4.0,6.7,2.7,4.1,8.5,16.8,4.6,6.7,2.7,15.2,4.8};
        System.out.println("Values for day#1: "+ Arrays.toString(day2));
        System.out.println("Values for day#2: "+ Arrays.toString(anotherDay2));
        if (arraysMain.sameTempValues(day2,anotherDay2)){
            System.out.println("The values are matched.");
        }
        else{
            System.out.println("The values are different.");
        }
    }
}
