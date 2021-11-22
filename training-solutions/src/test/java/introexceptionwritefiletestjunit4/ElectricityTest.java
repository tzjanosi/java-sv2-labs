package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void TestOK() throws IOException {
        Path path = temporaryFolder.newFile("streets.txt").toPath();

        new Electricity().writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("2021. 11. 22.","Ádám", "Éva", "Tündér","Jonatán"), lines);
    }
}