package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);

        //When
        String name=dragon.getName();

        //Then
        assertEquals("Süsü",name);
        assertNotEquals("Suso",name);
    }
    @Test
    void testNumberOfHeads(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);

        //When
        int numberOfHeads=dragon.getNumberOfHeads();

        //Then
        assertEquals(1,numberOfHeads);
        assertTrue(numberOfHeads==1);
        assertFalse(numberOfHeads<1 || numberOfHeads>1);
    }
    @Test
    void testHeight(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);

        //When
        double height=dragon.getHeight();

        //Then
        assertEquals(2.5,height,0.00001);
    }
    @Test
    void testNull(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);
        Dragon dragonNull=null;

        //When

        //Then
        assertNull(dragonNull);
        assertNotNull(dragon);
    }
    @Test
    void testSameObjects(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);
        Dragon dragonReplica=dragon;

        //When

        //Then
        assertSame(dragon,dragonReplica);
    }
    @Test
    void testNotSameObjects(){
        //Given
        Dragon dragon=new Dragon("Süsü", 1, 2.5);
        Dragon dragonSameValues=new Dragon("Süsü", 1, 2.5);

        //When

        //Then
        //assertSame(dragon,dragonSameValues);
        assertNotSame(dragon,dragonSameValues);
    }
}
