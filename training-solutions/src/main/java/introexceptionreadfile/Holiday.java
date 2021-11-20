package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> toDoList = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/holiday.txt"));
            System.out.println(toDoList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
