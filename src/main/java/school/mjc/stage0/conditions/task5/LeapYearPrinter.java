package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = (year % 100) == 0;
        boolean isDivisibleBy400 = (year % 400) == 0;

        switch((isDivisibleBy4 ? 1 : 0) + (isDivisibleBy100 ? 2 : 0) + (isDivisibleBy400 ? 4 : 0)) {
            case 1:
            case 5:
            case 7:
                System.out.println("leap");
                break;
            case 0:
            case 2:
            case 3:
            case 4:
            case 6:
                System.out.println("not leap");
                break;
        }
    }
}
