package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts){
        int totalHeadcounts=0;
        for(int headcount:headcounts){
            totalHeadcounts+=headcount;
        }
    return totalHeadcounts;
    }
}
