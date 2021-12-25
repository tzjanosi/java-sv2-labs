package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> subjectList;
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public Tutor(String name, List<Subject> subjectList) {
        exceptionhandler.set(name,new IllegalArgumentException("Tutor needs a name!"));
        exceptionhandler.isStringEmpty();
        exceptionhandler.set(subjectList,new IllegalArgumentException("Subject list is empty!"));
        exceptionhandler.isListEmpty();
        this.name = name;
        this.subjectList = subjectList;
    }
    public String listTutorsSubjects(){
        StringBuilder output=new StringBuilder();
        for(int i=0; i< subjectList.size(); i++){
            output.append((i+1)+". "+subjectList.get(i).getSubjectName()+"\n");
        }
        return output.toString();
    }
    public Subject findSubjectByIndex(int index){
        exceptionhandler.set(index,new IllegalArgumentException("Index is out of range in findSubjectByIndex method!"));
        exceptionhandler.intBetweenLimits(0,subjectList.size());
        return subjectList.get(index-1);
    }
    public boolean tutorTeachingSubject(Subject subject){
        exceptionhandler.set(subject,new IllegalArgumentException("No subject was given for tutorTeachingSubject method."));
        exceptionhandler.isParameterNull();
        for(Subject subjectInLIst:subjectList){
            if(subject.getSubjectName().equals(subjectInLIst.getSubjectName())){
                return true;
            }
        }
    return false;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }
}
