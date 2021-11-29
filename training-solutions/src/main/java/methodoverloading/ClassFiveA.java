package methodoverloading;

import methodchain.Number;

import java.util.List;

public class ClassFiveA {
    List<String> studentsList;

    public ClassFiveA(List<String> studentsList) {
        this.studentsList = studentsList;
    }

    public String getTodayReferringStudent(int number){
        return studentsList.get(number-1);
    }
    public String getTodayReferringStudent(Number number){
        int numberValue = number.getValue();
        return getTodayReferringStudent(numberValue);
    }
    public String getTodayReferringStudent(String numberName){
        Number number=Number.valueOf(numberName.toUpperCase());
        return getTodayReferringStudent(number);
    }
}
