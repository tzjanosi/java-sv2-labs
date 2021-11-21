package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys=new PaulStreetBoys();
        List<String> namesList = paulStreetBoys.readRows();
        //System.out.println(namesList);
        System.out.println(paulStreetBoys.convertNames(namesList));
    }

    private String convertNames(List<String> namesList) {
        StringBuilder outputSB = new StringBuilder();

        for (int i = 0; i < namesList.size(); i++) {
            outputSB.append(("Nemecsek Ernő".equals(namesList.get(i))?namesList.get(i).toLowerCase():namesList.get(i))+"\n");
        }
        return outputSB.toString();
    }

    public List<String> readRows() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/palutcaifiuk.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
