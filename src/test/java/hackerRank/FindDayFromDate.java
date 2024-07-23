package hackerRank;

import java.time.LocalDate;

public class FindDayFromDate {

    public static void main(String[] args){
        int month = 07;
        int date = 23;
        int year = 2024;
        findDay(month, date, year);
        System.out.print(findDay(month, date, year));
    }

    private static String findDay(int month, int date, int year) {
        LocalDate ld = LocalDate.of(year, month, date);
        return ld.getDayOfWeek().name();
    }
}
