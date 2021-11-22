package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {
    @TempDir
    File temporaryFolder;

    @Test
    void TestOK() throws IOException {
        Path path = temporaryFolder.toPath().resolve("names.txt");
        new Electricity().writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("2021. 11. 22.","Ádám", "Éva", "Tündér","Jonatán"), lines);
    }
}