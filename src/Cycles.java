import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cycles {

    public static void main(String[] args) {
        System.out.println(calculatePeriods("01/03/2001", 3, 28));
        System.out.println(calculateOvulationPeriod("01/03/2001", 3, 28));
    }

    public static String calculatePeriods(String lastPeriodDate, int flowDays, int cycleDays) {
        LocalDate date = LocalDate.parse(lastPeriodDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        List<LocalDate> dates = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            dates.add(date);
            date = date.plusDays(cycleDays);
        }
        System.out.println("Period dates for the next 12 months");
        dates.remove(0);
        return dates.toString();
    }
    public static String calculateOvulationPeriod(String lastPeriodDate, int flowDays, int cycleDays) {
        LocalDate dateOfOvulation = LocalDate.parse(lastPeriodDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        int ovulationPeriod = cycleDays + (cycleDays / 2);
        List<LocalDate> ovulationDates = new ArrayList<>();
        for (int i = 0; i <= 25; i++) {
            ovulationDates.add(dateOfOvulation);
            dateOfOvulation = dateOfOvulation.plusDays((cycleDays / 2));
//            System.out.println(ovulationDates.get(i));
        }
        ovulationDates.remove(0);
        ovulationDates.remove(1);
        ovulationDates.remove(2);
        ovulationDates.remove(0);ovulationDates.remove(2);ovulationDates.remove(3);ovulationDates.remove(4);ovulationDates.remove(5); ovulationDates.remove(6);ovulationDates.remove(7); ovulationDates.remove(8);ovulationDates.remove(9);ovulationDates.remove(10);ovulationDates.remove(11);
        System.out.println("Ovulation dates for the next 12 months");
        return ovulationDates.toString();
    }
}

