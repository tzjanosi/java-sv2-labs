package schoolrecords;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {
    private Scanner scanner = new Scanner(System.in);
    private ClassRecords classRecords;
    public void init(){
        Subject subjectFoldrajz=new Subject("földrajz");
        Subject subjectMatematika=new Subject("matematika");
        Subject subjectBiologia=new Subject("biológia");
        Subject subjectZene=new Subject("zene");
        Subject subjectFizika=new Subject("fizika");
        Subject subjectKemia=new Subject("kémia");
        Subject subjectRajz=new Subject("rajz");
        Subject subjectTestneveles=new Subject("testnevelés");

        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(subjectFoldrajz,
                        subjectMatematika,
                        subjectBiologia,
                        subjectZene,
                        subjectFizika,
                        subjectKemia));
        Tutor tutor2 = new Tutor("Barna Gábor",
                Arrays.asList(subjectRajz,
                        subjectZene,
                        subjectTestneveles));
        Tutor tutor3 = new Tutor("Haragos Jolán",
                Arrays.asList(subjectKemia,
                        subjectFizika,
                        subjectMatematika));


        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));

        classRecords = new ClassRecords("Fourth Grade A", new Random());
        classRecords.addTutor(tutor);
        classRecords.addTutor(tutor2);
        classRecords.addTutor(tutor3);
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);

    };
    public void printMenu(){
        printVerticalSeparator(2);
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }
    public void runMenu(){
        String inputFromUser;
        int chosenMenu;
        do{
            printMenu();
            inputFromUser = scanner.nextLine();
            chosenMenu=createMenuNumberFromInput(inputFromUser);
            subMenu(chosenMenu);
        }
        while(chosenMenu!=11);
    }
    private void subMenu(int chosenMenu) {
        switch(chosenMenu) {
            case 1:
                subMenu1();
                break;
            case 2:
                subMenu2();
                break;
            case 3:
                subMenu3();
                break;
            case 4:
                subMenu4();
                break;
            case 5:
                subMenu5();
                break;
            case 6:
                subMenu6();
                break;
            case 7:
                subMenu7();
                break;
            case 8:
                subMenu8();
                break;
            case 9:
                subMenu9();
                break;
            case 10:
                subMenu10();
                break;
        }
    }
    private void subMenu1() {
        printVerticalSeparator(1);
        System.out.println("Tanulók nevei:");
        System.out.println(classRecords.listStudentNames());
    }
    private void subMenu2() {
        printVerticalSeparator(1);
        System.out.println("Diák keresése név alapján");
        System.out.println("Diák neve:");
        String name = scanner.nextLine();
        System.out.println(classRecords.findStudentByName(name));
    }
    private void subMenu3() {
        printVerticalSeparator(1);
        System.out.println("Diák létrehozása");
        System.out.println("Diák neve:");
        String name = scanner.nextLine();
        Student student=new Student(name);
        if(classRecords.addStudent(student)){
            System.out.println(name+" felvéve az osztályba!");
        }
        else{
            System.out.println("Nem sikerült "+name+"-t felvenni az osztályba!");
        }
    }
    private void subMenu4() {
        printVerticalSeparator(1);
        System.out.println("Diák törlése név alapján");
        System.out.println("Diák neve:");
        String name = scanner.nextLine();
        Student student=classRecords.findStudentByName(name);
        if(classRecords.removeStudent(student)){
            System.out.println(name+" törölve az osztályból!");
        }
        else{
            System.out.println("Nem sikerült "+name+"-t törölni az osztályból!");
        }
    }
    private void subMenu5() {
        printVerticalSeparator(1);
        System.out.println("Diák feleltetése");
        Student unlucky=classRecords.repetition();
        System.out.println("Felelő: "+unlucky.getName());
        Tutor chosenTutor=getTutor();
        Subject chosenSubject=getSubject(chosenTutor);
        MarkType chosenMark=getMark();
        unlucky.grading(new Mark(chosenMark, chosenSubject, chosenTutor));

        System.out.println(unlucky);
    }
    private void subMenu6() {
        printVerticalSeparator(1);
        System.out.println("Osztályátlag");
        System.out.println("Az osztályátlag: "+classRecords.calculateClassAverage());
    }
    private void subMenu7() {
        printVerticalSeparator(1);
        System.out.println("Tantárgyi átlag kiszámolása");
        Subject chosenSubject=getSubjectFromAll();
        System.out.println(chosenSubject.getSubjectName()+" átlaga: "+classRecords.calculateClassAverageBySubject(chosenSubject));
    }
    private void subMenu8() {
        printVerticalSeparator(1);
        System.out.println("Diákok átlagának megjelenítése");
        List<StudyResultByName> studyResultByNameList=classRecords.listStudyResults();
        for(StudyResultByName studyResultByName:studyResultByNameList){
            System.out.println(studyResultByName);
        }
    }
    private void subMenu9() {
        printVerticalSeparator(1);
        System.out.println("Diák átlagának kiírása");
        System.out.println("Diák neve:");
        String name = scanner.nextLine();
        System.out.println(name+" átlaga:"+classRecords.findStudentByName(name).calculateAverage());
    }
    private void subMenu10() {
        printVerticalSeparator(1);
        System.out.println("Diák tantárgyhoz tartozó átlagának kiírása");
        System.out.println("Diák neve:");
        String name = scanner.nextLine();
        Subject chosenSubject=getSubjectFromAll();

        System.out.println(name+" átlaga "+chosenSubject.getSubjectName()+"-ból:"+classRecords.findStudentByName(name).calculateSubjectAverage(chosenSubject));
    }


    private MarkType getMark(){
        MarkType[] marksArray=MarkType.values();
        int ordinal;
        for(int i=marksArray.length-1;i>=0;i--){
            ordinal=marksArray.length-i;
            System.out.println(ordinal+". "+marksArray[i]);
        }
        String inputString = scanner.nextLine();
        int chosenMarkNumber=createMenuNumberFromInput(inputString);
        return marksArray[marksArray.length-chosenMarkNumber];
    }
    private Tutor getTutor(){
        System.out.println("Válassz tanárt!");
        System.out.println(classRecords.listTutorsNames());
        String inputString = scanner.nextLine();
        int chosenTutorNumber=createMenuNumberFromInput(inputString);
        return classRecords.findTutorByIndex(chosenTutorNumber);
    }
    private Subject getSubject(Tutor chosenTutor){
        System.out.println("Válassz tárgyat!");
        System.out.println(chosenTutor.listTutorsSubjects());
        String inputString = scanner.nextLine();
        int chosenSubjectNumber=createMenuNumberFromInput(inputString);
        return chosenTutor.findSubjectByIndex(chosenSubjectNumber);
    }
    private Subject getSubjectFromAll(){
        System.out.println("Válassz tárgyat!");
        classRecords.setSubjectLIst();
        System.out.println(classRecords.listAllSubjects());
        String inputString = scanner.nextLine();
        int chosenSubjectNumber=createMenuNumberFromInput(inputString);
        return classRecords.getSubjectList().get(chosenSubjectNumber-1);
    }
    private int createMenuNumberFromInput(String inputFromUser) {
        StringBuilder onlyDigits = new StringBuilder();
        for (int i = 0; i < inputFromUser.length(); i++) {
            if (Character.isDigit(inputFromUser.charAt(i))) {
                onlyDigits.append(inputFromUser.charAt(i));
            }
        }
        if(!onlyDigits.isEmpty()){
            int inputNumber=Integer.parseInt(onlyDigits.toString());
            if(0<inputNumber&&inputNumber<12) {
                return inputNumber;
            }
        }
        throw new IllegalArgumentException("Please, type in numbers between 1 and 11 (limits are included)!");
    }
    private void printVerticalSeparator(int repeat) {
        System.out.println();
        for(int i=1;i<=repeat;i++) {
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }


    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController=new SchoolRecordsController();
        schoolRecordsController.init();
        schoolRecordsController.runMenu();
    }
}
