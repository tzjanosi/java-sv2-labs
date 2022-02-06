package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{
    private String title;
    private int length;
    private List<String> performers;
    private List<String> compositors;

    public AudioFeatures(String title, int length, List<String> performers, List<String> compositors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title mustn't be empty!");
        }
        if(length<=0){
            throw new IllegalArgumentException("Length is not correct!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Performers mustn't be empty!");
        }

        this.title = title;
        this.length = length;
        this.performers = performers;
        this.compositors = compositors;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title mustn't be empty!");
        }
        if(length<=0){
            throw new IllegalArgumentException("Length is not correct!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Performers mustn't be empty!");
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.compositors = new ArrayList<>();
    }

    @Override
    public List<String> getContributors() {
        List<String> output = new ArrayList<String>(compositors);
        output.addAll(performers);
        return output;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getNumberOfPages() {
        return 0;
    }
}
