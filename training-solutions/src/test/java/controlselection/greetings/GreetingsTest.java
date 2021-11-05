package controlselection.greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    private Greetings greetings;
    @BeforeEach
    void createGreetings(){
        greetings=new Greetings();
    }
    @Test
    void test(){
        String greetingString=greetings.greeting(0,0);
        assertEquals(greetingString,"jó éjt");
        greetingString=greetings.greeting(5,0);
        assertEquals(greetingString,"jó éjt");
        greetingString=greetings.greeting(5,1);
        assertEquals(greetingString,"jó reggelt");
        greetingString=greetings.greeting(8,59);
        assertEquals(greetingString,"jó reggelt");
        greetingString=greetings.greeting(9,0);
        assertEquals(greetingString,"jó napot");
        greetingString=greetings.greeting(18,30);
        assertEquals(greetingString,"jó napot");
        greetingString=greetings.greeting(18,31);
        assertEquals(greetingString,"jó estét");
        greetingString=greetings.greeting(20,0);
        assertEquals(greetingString,"jó estét");
        greetingString=greetings.greeting(20,1);
        assertEquals(greetingString,"jó éjt");
        greetingString=greetings.greeting(23,59);
        assertEquals(greetingString,"jó éjt");

    }


}
