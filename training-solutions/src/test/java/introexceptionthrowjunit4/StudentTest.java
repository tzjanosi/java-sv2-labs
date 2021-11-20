package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentTest {
    @Test
    public void testOK(){
        //Given
        introexceptionthrowjunit4.Student student=new Student();

        //When
        student.addNote(5);

        //Then
        assertThat(student.getNotesList().get(0),equalTo(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNOK1() {
        //Given
        introexceptionthrowjunit4.Student student=new Student();

        //When
        student.addNote(0);

        //Then
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testNOK2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        //Given
        introexceptionthrowjunit4.Student student=new Student();

        //When
        student.addNote(6);

        //Then
    }

    @Test
    public void testNOK3() {
        //Given
        introexceptionthrowjunit4.Student student=new Student();

        //When


        //Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(-1));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }




}