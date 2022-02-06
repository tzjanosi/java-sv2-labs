package catalog;

public class SearchCriteria {
    private String title=null;
    private String contributor=null;

    public static SearchCriteria createByBoth(String title,String contributor){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title mustn't be empty!");
        }
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Contributor mustn't be empty!");
        }
        SearchCriteria searchCriteria=new SearchCriteria();
        searchCriteria.setTitle(title);
        searchCriteria.setContributor(contributor);
        return searchCriteria;
    }

    public static SearchCriteria createByTitle(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title mustn't be empty!");
        }
        SearchCriteria searchCriteria=new SearchCriteria();
        searchCriteria.setTitle(title);
        return searchCriteria;
    }

    public static SearchCriteria createByContributor(String contributor){
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Contributor mustn't be empty!");
        }
        SearchCriteria searchCriteria=new SearchCriteria();
        searchCriteria.setContributor(contributor);
        return searchCriteria;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public boolean hasTitle(){
        return !(title==null || title.isEmpty());
    }
    public boolean hasContributor(){
        return !(contributor==null || contributor.isEmpty());
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }
}
