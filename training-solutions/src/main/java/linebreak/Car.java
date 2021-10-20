package linebreak;

public class Car {
    private static String brand="Trabant";
    private static String type="601";

    public static String getBrandAndTypeInSeparateLines(String brand, String type){
       return  brand+System.lineSeparator()+type;
    }

    public static void main(String[] args) {
        System.out.println(getBrandAndTypeInSeparateLines(brand,type));
    }
}
