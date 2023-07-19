package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {

        String text;
        switch (number) {
            case (1),
                    (2),
                    (3),
                    (4),
                    (5):
                text = "number is between 1 and 5";
                break;
            case (6),
                    (7),
                    (8),
                    (9),
                    (10):
                text = "number is between 6 and 10";
                break;
            default:
                text = "out of range";
                break;
        }
    }
}
