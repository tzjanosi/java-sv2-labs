package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Electricity {
    private List<String> dateAndStreetsList;

    public Electricity() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy. MM. dd.");
        LocalDateTime today = LocalDateTime.now();

        String[] list={dateFormat.format(today),"Ádám", "Éva", "Tündér","Jonatán"};
        this.dateAndStreetsList = Arrays.asList(list);
    }
    public void writeStreets(Path path){
        try {
            Files.write(path, dateAndStreetsList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }
}
