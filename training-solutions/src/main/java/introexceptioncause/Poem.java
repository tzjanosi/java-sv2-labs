package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        Poem poem=new Poem();
        List<String> rows = poem.readRows();
        System.out.println(rows);
        System.out.println(poem.getFirstLetter(rows));
    }
    public List<String> readRows() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/poem.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
    String getFirstLetter(List<String> rows) {
        StringBuilder outputSB = new StringBuilder();

        for (int i = 0; i < rows.size(); i++) {
            outputSB.append(rows.get(i).charAt(0));
        }
        return outputSB.toString();
    }
}
