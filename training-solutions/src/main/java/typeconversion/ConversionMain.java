package typeconversion;

import java.util.Random;

public class ConversionMain {
    public static void main(String[] args) {
        Random rnd = new Random();
        Conversion conversion=new Conversion();
        double randomDouble= 128.0 * rnd.nextDouble();
        System.out.println(randomDouble+" after conversion is: "+conversion.convertDoubleToDouble(randomDouble));
    }
}
