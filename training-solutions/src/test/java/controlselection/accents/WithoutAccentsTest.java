package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    void Test(){
        WithoutAccents withoutAccents=new WithoutAccents();
        char newChar;
        newChar=withoutAccents.removeAccent('á');
        assertEquals(newChar,'a');
        newChar=withoutAccents.removeAccent('Á');
        assertEquals(newChar,'A');
        newChar=withoutAccents.removeAccent('ó');
        assertEquals(newChar,'o');
        newChar=withoutAccents.removeAccent('Ő');
        assertEquals(newChar,'O');
        newChar=withoutAccents.removeAccent('ü');
        assertEquals(newChar,'u');
        newChar=withoutAccents.removeAccent('e');
        assertEquals(newChar,'e');



    }
}
