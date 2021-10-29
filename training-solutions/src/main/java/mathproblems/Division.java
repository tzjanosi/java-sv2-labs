package mathproblems;

import java.util.Random;

public class Division {
    public void getDivisors(int number){
        if(number<1){
            System.out.println("Nem pozitív.");
        }
        else{
            System.out.println(number+" osztója: 1");
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    System.out.println(number+" osztója: "+i);
                }
            }
            System.out.println(number+" osztója: "+number);
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int positiveNumber = 1+rnd.nextInt(1023);
        Division division=new Division();
        division.getDivisors(positiveNumber);
    }
}
