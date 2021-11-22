package introexceptionreadfiletestjunit4;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {
    private Words words;

    @Before
    public void setUp() {
        words=new Words();
    }
    @Test
    public void testWordsOK() {
        String FirstWordWithA=words.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", FirstWordWithA);
    }
    @Test
    public void testWordsNOK() {
        String FirstWordWithA=words.getFirstWordWithA(Paths.get("src/test/resources/wordsNOK.txt"));
        assertEquals("A", FirstWordWithA);
    }
}