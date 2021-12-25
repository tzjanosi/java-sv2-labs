package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> studentsList=new ArrayList<>();
    private List<Tutor> tutorsList=new ArrayList<>();
    private List<Subject> subjectList=new ArrayList<>();
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public ClassRecords(String className, Random random) {
        exceptionhandler.set(className,new IllegalArgumentException("Class must have a name!"));
        exceptionhandler.isStringEmpty();
        exceptionhandler.set(random,new NullPointerException("Random is missing!"));
        exceptionhandler.isParameterNull();

        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        exceptionhandler.set(student,new IllegalStateException("No student was given to add!"));
        exceptionhandler.isParameterNull();
        if(!nameExistsInTheList(student.getName(),studentsList)) {
            studentsList.add(student);
            return true;
        }
        return false;
    }


    public boolean addTutor(Tutor tutor) {
        exceptionhandler.set(tutor,new IllegalStateException("No tutor was given to add!"));
        exceptionhandler.isParameterNull();
        if(!nameExistsInTheList(tutor.getName(),tutorsList)) {
            tutorsList.add(tutor);
            return true;
        }
        return false;
    }

    public void setSubjectLIst(){
        for(Tutor tutor:tutorsList){
            for(Subject subject:tutor.getSubjectList()){
                if(!subjectList.contains(subject)){
                    subjectList.add(subject);
                }
            }
        }
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public String listAllSubjects(){
        StringBuilder output=new StringBuilder();
        for(int i=0; i< subjectList.size(); i++){
            output.append((i+1)+". "+subjectList.get(i).getSubjectName()+"\n");
        }
        return output.toString();
    }

    private boolean nameExistsInTheList(String name,List<?> list) {
        exceptionhandler.set(name,new IllegalArgumentException("null parameter was given to the method: nameExistsInTheList!"));
        exceptionhandler.isStringEmpty();

        for(Student student:studentsList){
            if(name.equals(student.getName())){
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(Student student){
        exceptionhandler.set(student,new IllegalStateException("No student was given to remove!"));
        exceptionhandler.isParameterNull();

        if(nameExistsInTheList(student.getName(),studentsList)) {
            studentsList.remove(student);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        exceptionhandler.set(studentsList,new ArithmeticException("No student in the class, average calculation aborted!"));
        exceptionhandler.isListEmpty();

        double total=0;
        for(Student student:studentsList){
            total+=student.calculateAverage();
        }
        if(total==0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return total/ studentsList.size();
    }

    public double calculateClassAverageBySubject(Subject subject){
        exceptionhandler.set(studentsList,new ArithmeticException("No student in the class, average calculation is aborted!"));
        exceptionhandler.isListEmpty();
        double total=0;
        int numberOfStudentsWithMark=0;
        for(Student student:studentsList){
            double studentAverage=student.calculateSubjectAverage(subject);
            if(studentAverage>0) {
                total += student.calculateSubjectAverage(subject);
                numberOfStudentsWithMark++;
            }
        }
        return total/numberOfStudentsWithMark;
    }

    public Student findStudentByName(String name){
        if(name==null || name.equals("")){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        exceptionhandler.set(studentsList,new IllegalStateException("No students to search!"));
        exceptionhandler.isListEmpty();

        for(Student student:studentsList){
            if(name.equals(student.getName())){
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! "+name);
    }
    public Tutor findTutorByIndex(int index){
        exceptionhandler.set(index,new IllegalArgumentException("Index is out of range in findTutorByIndex method!"));
        exceptionhandler.intBetweenLimits(0,tutorsList.size());

        return tutorsList.get(index-1);
    }

    public Student repetition(){
        exceptionhandler.set(studentsList,new IllegalStateException("No students to select for repetition!"));
        exceptionhandler.isListEmpty();

        return studentsList.get(random.nextInt(studentsList.size()));
    }
    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> outputList=new ArrayList<>();
        for(Student student:studentsList){
            outputList.add(new StudyResultByName(student.getName(),student.calculateAverage()));
        }
        return outputList;
    }
    public String listStudentNames(){
        List<String> namesList=new ArrayList<>();
        for(Student student:studentsList){
            namesList.add(student.getName());
        }
        return String.join(", ", namesList);
    }
    public String listTutorsNames(){
        StringBuilder output=new StringBuilder();
        for(int i=0; i< tutorsList.size(); i++){
            Tutor tutor=tutorsList.get(i);
            output.append((i+1)+". "+tutor.getName()+"\n");
        }
        return output.toString();
    }


    public String getClassName() {
        return className;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }
}