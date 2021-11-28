package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SeparatedSum {

    public Sums sum(String floatingNumbers){
        double sumPositives=0;
        double sumNegatives=0;
        String doublesString=replaceComaWithPoint(floatingNumbers);
        String[] doublesArray=doublesString.split(";");
        for(String doubleString:doublesArray){
            double number=Double.parseDouble(doubleString);
            if(number>0){
                sumPositives+=number;
            }
            else{
                sumNegatives+=number;
            }
        }
        return new Sums(sumPositives, sumNegatives);
    }

    private String replaceComaWithPoint(String input){
        return input.replaceAll(",",".");
    }


    public String readFromFile(){
        try {
            return Files.readAllLines(Paths.get("src/main/java/methodparam/sums/floatingnumbers.txt")).get(0);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }
}
