package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class SchoolTest {
    @Test
    void testOK(){
        School school=new School();
        List<Integer> headcounts=new ArrayList<>(Arrays.asList(15,20,25));
        int totalHeadcounts=school.getNumberOfStudents(headcounts);
        assertEquals(60,totalHeadcounts);
    }
}