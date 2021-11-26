package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    @Test
    void testGetFirstTwoLetters() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> wordsList = Arrays.asList("Vörös", "narancs", "sárga", "Zöld", "kék", "ibolya");
        List<String> expected = Arrays.asList("Vö", "na", "sá", "Zö", "ké", "ib");
        List<String> transformed = twoLetters.getFirstTwoLetters(wordsList);
        assertEquals(transformed, expected);
    }
}