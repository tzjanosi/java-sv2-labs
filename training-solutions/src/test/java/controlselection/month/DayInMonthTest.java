package controlselection.month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {
    private DayInMonth dayInMonth;
    private int numberOfDaysInMonth;
    @BeforeEach
    void createDayInMonth(){
        dayInMonth=new DayInMonth();
    }
    @Test
    void test(){
        numberOfDaysInMonth=dayInMonth.numberOfDaysInMonth(2021,"november");
        assertEquals(numberOfDaysInMonth,30);
        numberOfDaysInMonth=dayInMonth.numberOfDaysInMonth(2021,"novembe");
        assertEquals(numberOfDaysInMonth,0);
        numberOfDaysInMonth=dayInMonth.numberOfDaysInMonth(2020,"február");
        assertEquals(numberOfDaysInMonth,29);
        numberOfDaysInMonth=dayInMonth.numberOfDaysInMonth(2100,"február");
        assertEquals(numberOfDaysInMonth,28);
        numberOfDaysInMonth=dayInMonth.numberOfDaysInMonth(2000,"február");
        assertEquals(numberOfDaysInMonth,29);

    }
}
