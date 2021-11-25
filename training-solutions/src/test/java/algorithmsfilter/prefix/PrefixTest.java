package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
    void testGetWordsStartWith() {
        Prefix word = new Prefix();
        List<String> words = Arrays.asList("alma", "alezredes", "alak", "piros", "ember", "alap");
        List<String> expected = word.getWordsStartWith(words, "al");
        assertEquals(4, expected.size());
        assertTrue(expected.contains("alap"));
        assertFalse(expected.contains("piros"));
    }
}