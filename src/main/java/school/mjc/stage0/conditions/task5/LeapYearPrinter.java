package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        if (year == 365){
            System.out.println("leap");
        } else if (year==366) {
            System.out.println("not leap");
        }
    }
}
