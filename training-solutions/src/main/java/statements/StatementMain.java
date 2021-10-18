package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x=5+6;
        int y=11-x;
        int z=8;
        boolean b=x>y;
        boolean c= b || (z>5);

        System.out.println("Value of x (5+6) is: "+x);
        System.out.println("Value of y (11-x) is: "+y);
        System.out.println("Value of z (=8) is: "+z);
        System.out.println("Value of b (x>y) is: "+b);
        System.out.println("Value of c (b || (z>5)) is: "+c);

        z+=1;
        System.out.println();
        System.out.println("Value of z (=z+1) is: "+z);

    }
}
