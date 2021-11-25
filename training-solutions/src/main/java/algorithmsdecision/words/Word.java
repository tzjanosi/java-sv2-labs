package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> wordsList, String etalon){
        int limit=etalon.length();
        for(String word:wordsList){
            if(word.length()>limit){
                return true;
            }
        }
        return false;
    }
}