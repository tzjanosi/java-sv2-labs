package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileConverter {
    private List<String> inputStringList=new ArrayList<>();
    private List<String> ConvertedStringList=new ArrayList<>();
    public void readInput(String pathString){
        //"src/test/java/introexceptionwritefiletestjunit4/books.txt"
        try {
            inputStringList = Files.readAllLines(Paths.get(pathString));
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public void converter(){
        for (int i = 0; i < inputStringList.size(); i++) {
            ConvertedStringList.add(inputStringList.get(i).split(";")[2]+": "+inputStringList.get(i).split(";")[1]);
        }
    }
    public void writeOutput(String pathString){
        //"src/test/java/introexceptionwritefiletestjunit4/booksConverted.txt"
        try {
            Files.write(Paths.get(pathString), ConvertedStringList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }

    }
    }
