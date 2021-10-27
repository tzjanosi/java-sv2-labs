package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("Direct concat:");
        System.out.println(""+1+2);
        System.out.println("String.valueOf():");
        System.out.println(String.valueOf(1)+String.valueOf(2));
        System.out.println();

        double quotient=3/4;
        System.out.println("3/4="+quotient);
        System.out.println("3.0/4="+3.0/4);
        System.out.println("3d/4="+3d/4);
        System.out.println();

        long big=3_244_444_444L;
        System.out.println(big);
        System.out.println();

        String word="title".toUpperCase();
        System.out.println("\"title\".toUpperCase() = "+word);

        System.out.println("Binary 1: "+Integer.toBinaryString(1));
        System.out.println("Binary -2 ver1: "+Integer.toBinaryString(-2));
        System.out.println("Binary -2 ver2: "+Integer.toString(-2, 2));

        System.out.println();
        System.out.println("2021:");
        System.out.println("Binary 2021: "+Integer.toString(2012, 2));
        System.out.println("Octal 2021: "+Integer.toString(2012, 8));
        System.out.println("Decimal 2021: "+Integer.toString(2012, 10));
        System.out.println("Hexadecimal 2021: "+Integer.toString(2012, 16));



    }
}
