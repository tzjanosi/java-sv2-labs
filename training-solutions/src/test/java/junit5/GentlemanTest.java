package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GentlemanTest {
    @Test
    void testAlap(){
        //Given
        junit5.Gentleman gentleman=new junit5.Gentleman();

        //When
        String output=gentleman.sayHello("Janosi Tibor");

        //Then
        assertEquals("Hello Janosi Tibor",output);
    }

    @Test
    void testAlap2(){
        //Given
        junit5.Gentleman gentleman=new junit5.Gentleman();
        String name=null;

        //When
        String output=gentleman.sayHello(name);

        //Then
        assertEquals("Hello Anonymous",output);
    }
}
