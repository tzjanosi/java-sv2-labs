package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    private Ship ship;
    @BeforeEach
    void createShip(){
        ship=new Ship("Santa Maria", 1489, 30.2);
    }
    @Test
    void testName(){
        //When
        String name=ship.getName();

        //Then
        assertEquals("Santa Maria",name);
        assertNotEquals("Sánta Maria",name);
    }
    @Test
    void testYearOfConstruction(){
        //When
        int yearOfConstruction=ship.getYearOfConstruction();

        //Then
        assertEquals(1489,yearOfConstruction);
        assertTrue(1489==yearOfConstruction);
        assertFalse(1489!=yearOfConstruction);
    }
    @Test
    void testLength(){
        //When
        double length=ship.getLength();

        //Then
        assertEquals(30.2,length,0000003);
    }
    @Test
    void testNull(){
        Ship ship2=null;

        //When

        //Then
        assertNotNull(ship);
        assertNull(ship2);
    }
    @Test
    void testSameObjects(){
        Ship ship2=ship;

        //When

        //Then
        assertSame(ship,ship2);
    }
    @Test
    void testNotSameObjects(){
        Ship ship2=new Ship("Santa Maria", 1489, 30.2);

        //When

        //Then
        assertNotSame(ship,ship2);
    }


}
