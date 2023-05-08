import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CyclesTest {

    @org.junit.jupiter.api.Test
    void calculatePeriodsForNextTwelveMonthsTest() {
        var calculatePeriod = Cycles.calculatePeriods("01/03/2001", 3, 28);
        assertEquals(Arrays.toString(new String[]{"2001-03-29", "2001-04-26", "2001-05-24", "2001-06-21", "2001-07-19", "2001-08-16", "2001-09-13", "2001-10-11", "2001-11-08", "2001-12-06", "2002-01-03", "2002-01-31"}),calculatePeriod);
    }
    @Test
    void calculateOvulationDateForNextTwelveMonthsTest(){
        var calculateOvulation = Cycles.calculateOvulationPeriod("01/03/2001", 3, 28);
        assertEquals(Arrays.toString(new String[]{"2001-04-12", "2001-05-10", "2001-06-07", "2001-07-05", "2001-08-02", "2001-08-30", "2001-09-27", "2001-10-25", "2001-11-22", "2001-12-20", "2002-01-17", "2002-02-14"}), calculateOvulation);
    }
    }
