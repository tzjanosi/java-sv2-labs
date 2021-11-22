package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileConverterTest {
    @TempDir
    File temporaryFolder;

    @Test
    void TestOK() throws IOException {
        String convertedFileNameAndPath="src/test/java/introexceptionwritefiletestjunit5/booksConverted.txt";
        FileConverter fileConverter=new FileConverter();
        fileConverter.readInput("src/test/java/introexceptionwritefiletestjunit5/books.txt");
        fileConverter.converter();
        fileConverter.writeOutput(convertedFileNameAndPath);

        List<String> lines = Files.readAllLines(Paths.get(convertedFileNameAndPath));
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk","Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"), lines);
    }
}