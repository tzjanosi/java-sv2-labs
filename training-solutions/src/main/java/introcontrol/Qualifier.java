package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in an integer:");
        int inputNumber=scanner.nextInt();
        String output=(inputNumber>100?"Nagyobb, mint száz":"Száz, vagy kisebb");
        System.out.println(output);
    }
}
