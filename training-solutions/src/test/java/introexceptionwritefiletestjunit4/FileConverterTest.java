package introexceptionwritefiletestjunit4;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FileConverterTest {
    @Test
    public void Test() throws IOException {
        String convertedFileNameAndPath="src/test/java/introexceptionwritefiletestjunit4/booksConverted.txt";
        FileConverter fileConverter=new FileConverter();
        fileConverter.readInput("src/test/java/introexceptionwritefiletestjunit4/books.txt");
        fileConverter.converter();
        fileConverter.writeOutput(convertedFileNameAndPath);

        List<String> lines = Files.readAllLines(Paths.get(convertedFileNameAndPath));
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk","Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"), lines);
    }

}