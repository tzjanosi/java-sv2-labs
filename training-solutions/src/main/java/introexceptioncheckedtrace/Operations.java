package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            List<String> numberOfCars = operations.readFile();
            System.out.println(numberOfCars);
            System.out.println(operations.getDailySchedule(numberOfCars));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    List<String> readFile() throws IOException {
        List<String> all = Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/underground.txt"));
        return all;
    }

    String getDailySchedule(List<String> numberOfCars) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime today = LocalDateTime.now();
        StringBuilder outputSB = new StringBuilder(dateFormat.format(today) + ", ");

        Character two = '2';
        for (int i = 0; i < numberOfCars.size(); i++) {
            if (two.equals(numberOfCars.get(i).charAt(0))) {
                outputSB.append(numberOfCars.get(i) + " ");
            }
        }
        return outputSB.toString();
    }
}
