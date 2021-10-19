package javaapi;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in some text to convert:");
        String basicText=scanner.nextLine();
        System.out.println("The uppercase version is:");
        System.out.println(basicText.toUpperCase());
    }
}
