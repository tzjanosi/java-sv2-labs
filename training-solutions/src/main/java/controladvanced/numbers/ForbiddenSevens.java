package controladvanced.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForbiddenSevens {
    public boolean isContainsNumber(int findNumber, int inWhichNumber){
        if(String.valueOf(inWhichNumber).indexOf(String.valueOf(findNumber))>-1){
            return true;
        }
        return false;
    }
    public List<String> createNumbersArray(int min){
        List<String> numberList = new ArrayList<>();
        int i=min;
        while(!isContainsNumber(7,i) || i%7==0){
            if(i%7==0){
                numberList.add("x");
            }
            else{
                numberList.add(String.valueOf(i));
            }
            i++;
        }
        return numberList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot ahonnan a kiirás kezdődik!");
        int min=scanner.nextInt();

        ForbiddenSevens forbiddenSevens=new ForbiddenSevens();
        System.out.println(forbiddenSevens.createNumbersArray(min));
    }
}
