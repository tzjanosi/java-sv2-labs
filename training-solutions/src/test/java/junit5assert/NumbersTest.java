package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumbers(){
        //Given
        Numbers numbers=new Numbers();
        int[] intArray={1,4,5,-1,8,6,11,9};
        //When
        int[] onlyEven=numbers.getEvenNumbers(intArray);
        int[] expected={0,4,0,0,8,6,0,0};

        //Then
        assertArrayEquals(onlyEven,expected);
    }
}
