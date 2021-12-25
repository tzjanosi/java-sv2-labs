package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> markList=new ArrayList<>();
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public Student(String name) {
        exceptionhandler.set(name,new IllegalArgumentException("Student name must not be empty!"));
        exceptionhandler.isStringEmpty();
        this.name = name;
    }

    public void grading(Mark mark){
        exceptionhandler.set(mark,new NullPointerException("Mark must not be null!"));
        exceptionhandler.isParameterNull();
        markList.add(mark);
    }

    public double calculateAverage(){
        double total=0;
        int numberOfMarks=0;
        for(Mark mark:markList){
            total+=mark.getMarkType().getValue();
            numberOfMarks++;
        }
        return getRatio(total,numberOfMarks);
    }

    public double calculateSubjectAverage(Subject subject){
        double total=0;
        int numberOfMarks=0;
        for(Mark mark:markList){
            if(subject.getSubjectName().equals(mark.getSubject().getSubjectName())) {
                total += mark.getMarkType().getValue();
                numberOfMarks++;
            }
        }
        return getRatio(total,numberOfMarks);
    }

    private double getRatio(double total, int numberOfMarks) {
        double ratio=numberOfMarks>0?total/numberOfMarks:0;
        return getNDecimalForADouble(ratio,2);
    }

    private double getNDecimalForADouble(double input,int numberOfDecimalPlaces){
        int scale=(int) Math.pow(10,numberOfDecimalPlaces);
        return 1.0*Math.round(input*scale)/scale;
    }

    private boolean hasMarkFromThisSubject(String subjectName) {
        for(Mark mark:markList){
            if(subjectName.equals(mark.getSubject().getSubjectName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " marks: " + markListToString();
    }

    private String markListToString() {
        StringBuilder output= new StringBuilder();
        for(int i=0;i< markList.size();i++){
            output.append(markList.get(i).getSubjectAndMark());
            if(i<markList.size()-1){
                output.append(", ");
            }
        }
        return output.toString();
    }

    public String getName() {
        return name;
    }
}
