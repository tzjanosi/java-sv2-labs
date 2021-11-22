package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

class WordsTest {
    private Words words;

    @BeforeEach
    void setUp() {
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