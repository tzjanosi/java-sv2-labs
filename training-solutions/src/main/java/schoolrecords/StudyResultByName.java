package schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double mean;
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public StudyResultByName(String studentName, double mean) {
        exceptionhandler.set(studentName,new IllegalArgumentException("Student needs a name!"));
        exceptionhandler.isStringEmpty();

        this.studentName = studentName;
        this.mean = mean;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return mean;
    }

    @Override
    public String toString() {
        return studentName + ": " +mean;
    }
}
