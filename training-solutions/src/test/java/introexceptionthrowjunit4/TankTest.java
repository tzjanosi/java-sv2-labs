package introexceptionthrowjunit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class TankTest {
    private introexceptionthrowjunit4.Tank tank;

    @Before
    public void setUp() throws Exception {
        tank=new Tank();
    }
    @Test
    public void testOK(){
        //Given

        //When
        tank.modifyAngle(-25);

        //Then
        assertThat(tank.getAngle(),equalTo(-25));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNOK1() {
        //Given

        //When
        tank.modifyAngle(81);

        //Then
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testNOK2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The target position should be between -80 and 80 degree!");
        //Given

        //When
        tank.modifyAngle(-81);

        //Then
    }

    @Test
    public void testNOK3() {
        //Given

        //When


        //Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(125));
        assertEquals("The target position should be between -80 and 80 degree!", exception.getMessage());
    }
}