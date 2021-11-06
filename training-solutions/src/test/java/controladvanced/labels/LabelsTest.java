package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LabelsTest {
    @Test
    void Test(){
        Labels labels=new Labels();
        int[][] table= labels.getTableOfNumbers(5);
        int[] expected={4,5,6,7,8};
        assertArrayEquals(table[2],expected);

    }
}
