package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations{
    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        StringBuilder output = new StringBuilder();
        List<String> textList = readFromFile(path);
        for(int i=0;i<textList.size()-1;i++){
            output.append(textList.get(i).charAt(0));
        }
        output.append(textList.get(textList.size()-1));
        return output.toString();
    }
}
