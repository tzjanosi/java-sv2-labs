package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void testContainsFewerHabitants() {
        Town town = new Town();
        List<Integer> habitants = Arrays.asList(4000, 5000, 62500, 1984, 403);
        assertTrue(town.containsFewerHabitants(habitants, 500));
        assertFalse(town.containsFewerHabitants(habitants, 400));
    }
}