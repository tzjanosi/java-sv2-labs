package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    private List<String> wordsList;

    private void readWords(Path path){
        try {
            wordsList= Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
    public String getFirstWordWithA(Path path){
        readWords(path);
        Character charA = 'A';
        for (int i = 0; i < wordsList.size(); i++) {
            if(charA.equals(wordsList.get(i).charAt(0))){
                return wordsList.get(i);
            }
        }
        return "A";
    }
}
