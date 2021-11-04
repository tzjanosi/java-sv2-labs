package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GentlemanTest {
    @Test
    public void testAlap(){
        //Given
        Gentleman gentleman=new Gentleman();

        //When
        String output=gentleman.sayHello("Janosi Tibor");

        //Then
        assertThat(output,equalTo("Hello Janosi Tibor"));
    }

    @Test
    public void testAlap2(){
        //Given
        Gentleman gentleman=new Gentleman();
        String name=null;

        //When
        String output=gentleman.sayHello(name);

        //Then
        assertThat(output,equalTo("Hello Anonymous"));
    }
}
