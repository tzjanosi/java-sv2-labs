package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    private Words words;
    @BeforeEach
    void createWords(){
        words=new Words();
        String[] wordsArray={"fekete","Béla","fehér","farm","falat","galamb","halad"};
        for(String word:wordsArray) {
            words.addWord(word);
        }
    }
    @Test
    void testGetWordsStartWith(){
        words.getWordsStartWith("f");
        Words modifiedWords=words;

        Words expectedResult=new Words();
        String[] wordsArray={"fekete","fehér","farm","falat"};
        for(String word:wordsArray) {
            expectedResult.addWord(word);
        }
        assertEquals(modifiedWords.getWords(),expectedResult.getWords());
    }
    @Test
    void testGetWordsWithLength(){
        words.getWordsWithLength(5);
        Words modifiedWords=words;

        Words expectedResult=new Words();
        String[] wordsArray={"fehér","falat","halad"};
        for(String word:wordsArray) {
            expectedResult.addWord(word);
        }
        assertEquals(modifiedWords.getWords(),expectedResult.getWords());
    }
}
