package controlselection.week;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    private DayOfWeeks dayOfWeeks;
    private String description;
    @BeforeEach
    void createDayInMonth(){
        dayOfWeeks=new DayOfWeeks();
    }
    @Test
    void test(){
        description= dayOfWeeks.descriptionToDays("hétfő");
        assertEquals(description,"hét eleje");
        description= dayOfWeeks.descriptionToDays("Kedd");
        assertEquals(description,"hét közepe");
        description= dayOfWeeks.descriptionToDays("PÉNTEK");
        assertEquals(description,"majdnem hétvége");
        description= dayOfWeeks.descriptionToDays("SzomBaT");
        assertEquals(description,"hétvége");
        description= dayOfWeeks.descriptionToDays("Friday");
        assertEquals(description,"ismeretlen nap");

    }
}
