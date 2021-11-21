package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try {
            Neptun neptun=new Neptun();
            List<String> names = neptun.readNames();
            System.out.println(names);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public List<String> readNames() throws IOException {
        List<String> all = Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/neptun.csv"));
        List<String> names=new ArrayList<>();
        for (int i=0; i< all.size();i++){
            names.add(all.get(i).split(",")[1]);
        }
        return names;
    }
}
