package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarriage() {
        Woman woman = new Woman("Nagy Rozália", LocalDate.of(1983, 10, 22));
        Man man = new Man("Kiss József", LocalDate.of(1979, 3, 14));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.of(2007, 4, 6)));
        man.addRegisterDate(new RegisterDate("válás ideje", LocalDate.of(2010, 7, 9)));
        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals(man.getName()+"né", woman.getName());
        assertEquals(4, man.getRegisterDates().size());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }
}