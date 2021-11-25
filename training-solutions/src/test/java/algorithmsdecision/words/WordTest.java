package algorithmsdecision.words;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void testContainsLongerWord() {
        Word word = new Word();
        List<String> words = Arrays.asList("fehér", "piros", "vörös", "narancs");
        assertTrue(word.containsLongerWord(words, "kék"));
        assertFalse(word.containsLongerWord(words, "nagyonhosszú"));
        assertTrue(word.containsLongerWord(words, "ibolya"));
    }
}