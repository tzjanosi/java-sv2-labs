package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change change=new Change();
        System.out.println("Az átalakított: "+ Arrays.toString(change.changeNumbers()));
        }
}
