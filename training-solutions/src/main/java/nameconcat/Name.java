package nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title=null;


    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }
    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String output="";
        if (title != null){
            output+=title+". ";
        }
        output+=givenName+" ";
        output+=familyName+" ";
        if(!middleName.equals("")){
            output+=middleName;
        }
        return output;
    }

    public String concatNameHungarianStyle(){
        String output="";
        if (title != null){
            output=output.concat(title+". ");
        }
        output=output.concat(familyName+" ");
        if(!middleName.equals("")){
            output=output.concat(middleName+" ");
        }
        output=output.concat(givenName);

        return output;
    }
}
