package methodoverloading;

import methodchain.Number;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    List<String> studentsList=Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla", "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    ClassFiveA classFiveA = new ClassFiveA(studentsList);

    @Test
    void testGetTodayReferringStudentWithIntParameter() {
        String name = classFiveA.getTodayReferringStudent(3);

        assertEquals("Kiss József", name);
    }

    @Test
    void testGetTodayReferringStudentWithNumberParameter() {
        String name = classFiveA.getTodayReferringStudent(Number.THREE);

        assertEquals("Kiss József", name);
    }

    @Test
    void testGetTodayReferringStudentWithStringParameter() {
        String name = classFiveA.getTodayReferringStudent("three");

        assertEquals("Kiss József", name);
    }
}