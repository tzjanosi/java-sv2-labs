package methodoverloading;

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

    public enum Number {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11), TWELVE(12);

        private final int value;

        Number(int value){
            this.value=value;
        }

        public int getValue(){
            return value;
        }

    }
}
