package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private introexceptionthrowjunit5.Student student;

    @BeforeEach
    void setUp() {
        student=new Student();
    }

    @Test
    void testOK(){
        //When
        student.addNote(5);

        //Then
        assertEquals(5,student.getNotesList().get(0));
    }

    @Test
    public void testNOK() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(-1));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}