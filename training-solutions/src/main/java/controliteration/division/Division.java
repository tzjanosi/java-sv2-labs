package controliteration.division;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {
    public List<Integer> createNumberArray(int max, int divider){
        List<Integer> numberList = new ArrayList<>();
        for(int i=divider;i<max;i++){
            if(i%divider==0){
                numberList.add(i);
            }
        }
        return numberList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Division division=new Division();
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int max=scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider=scanner.nextInt();
        System.out.println(division.createNumberArray(max, divider));
    }
}
