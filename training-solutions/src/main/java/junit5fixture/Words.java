package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    List<String> words=new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }
    public void getWordsStartWith(String prefix){
        for (int i = words.size(); i > 0; i--) {
            if(!words.get(i-1).startsWith(prefix)){
                words.remove(i-1);
            }
        }
    }
    public void getWordsWithLength(int length){
        for (int i = words.size(); i > 0; i--) {
            if(words.get(i-1).length()!=length){
                words.remove(i-1);
            }
        }
    }
}
