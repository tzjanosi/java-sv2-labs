package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{
    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(numberOfPages<=0){
            throw new IllegalArgumentException("Number of pages is not correct!");
        }
        if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException("Authors mustn't be empty!");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getNumberOfPages() {
        return numberOfPages;
    }
}
