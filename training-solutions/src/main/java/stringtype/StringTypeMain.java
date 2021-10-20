package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix="Hello ";
        String name="John Doe";
        String message=prefix+name;
        System.out.println("Value of \"prefix\" is: "+prefix);
        System.out.println("Value of \"name\" is: "+name);
        System.out.println("Value of \"message\" is: "+message);

        message +=444;
        System.out.println("Value of \"message\" is: "+message);
        boolean b=message.equals("Hello John Doe");
        boolean d=message.equals("Hello John Doe444");
        System.out.println("Value of \"b\" is: "+b);
        System.out.println("Value of \"d\" is: "+d);

        String twoEmptyString=""+"";
        System.out.println("Value of \"twoEmptyString\" is: "+twoEmptyString);
        System.out.println("The length of \"twoEmptyString\" is: "+twoEmptyString.length());

        String abcde="Abcde";
        System.out.println("The length of \"Abcde\" is: "+abcde.length());
        System.out.println("The first and third characters of \"Abcde\" are: "+abcde.charAt(0)+", "+abcde.charAt(2));
        System.out.println("The substring of \"Abcde\" between the first and the third characters is: "+abcde.substring(0,3));

    }
}
