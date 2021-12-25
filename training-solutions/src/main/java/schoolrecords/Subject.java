package schoolrecords;

public class Subject {
    private String subjectName;
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public Subject(String subjectName) {
        exceptionhandler.set(subjectName,new IllegalArgumentException("Subject needs a name!"));
        exceptionhandler.isStringEmpty();
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
