package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number to check:");
        int numberToCheck = scanner.nextInt();
        if(numberToCheck%3==0){
            System.out.println("3 is a divider of "+numberToCheck+"!");
        }
        else{
            System.out.println("3 is NOT a divider of "+numberToCheck+"!");
        }
    }
}
