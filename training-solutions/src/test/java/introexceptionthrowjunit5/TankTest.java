package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    private introexceptionthrowjunit5.Tank tank;

    @BeforeEach
    void setUp() {
        tank=new Tank();
    }
    @Test
    public void testOK(){
        //When
        tank.modifyAngle(-25);

        //Then
        assertEquals(-25,tank.getAngle());
    }

    @Test
    public void testNOK() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(125));
        assertEquals("The target position should be between -80 and 80 degree!", exception.getMessage());
    }
}