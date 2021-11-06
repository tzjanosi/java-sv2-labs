package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    private ToConsonant toConsonant;
    private char newChar;
    @Test
    void test(){
        toConsonant=new ToConsonant();
        newChar=toConsonant.convertToConsonant('a');
        assertEquals(newChar,'b');
        newChar=toConsonant.convertToConsonant('E');
        assertEquals(newChar,'F');
        newChar=toConsonant.convertToConsonant('b');
        assertEquals(newChar,'b');
        newChar=toConsonant.convertToConsonant('T');
        assertEquals(newChar,'T');

    }
}
