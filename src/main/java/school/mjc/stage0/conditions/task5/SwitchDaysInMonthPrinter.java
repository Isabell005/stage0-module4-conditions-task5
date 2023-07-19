package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        String season;

        switch (month) {
            case (1),
                (3),
                (5),
                (7),
                (8),
                (10),
                (12):
                season = "31";
                break;
            case (2):
                season = "28";
                break;
            case (4), (6), (9), (11):
                season = "30";
                break;
            default:
                season = "wrong number!";
                break;
        }

    }
}


