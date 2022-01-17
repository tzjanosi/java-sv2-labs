package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    private List<ExamResult> examResultsList;

    public Exam(List<ExamResult> examResultsList) {
        this.examResultsList = examResultsList;
        Collections.sort(this.examResultsList);
    }
    public List<String> getNamesOfSucceededPeople(int places){
        List<String> namesOfSucceededPeople=new ArrayList<>();
        for(int i=0;i<places;i++){
            namesOfSucceededPeople.add(examResultsList.get(i).getName());
        }
        return namesOfSucceededPeople;
    }
}
