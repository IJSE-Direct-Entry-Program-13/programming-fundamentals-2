import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    final String COLOR_RED = "\u001b[31;1m";
    final String RESET = "\u001b[0m";

    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    if (year < 1800 || year > 2024) {
        System.out.println(STR."\{COLOR_RED}Invalid year, year should be between 1800 and 2024\{RESET}");
    } else {
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.print("Enter a day of the year: ");
        int dayOfYear = scanner.nextInt();
        if (dayOfYear < 1 || dayOfYear > (leapYear ? 366 : 365)) {
            System.out.println(STR."\{COLOR_RED}Invalid day of the year, it should be between 1 and \{leapYear ? 366 : 365}\{RESET}");
        }else{
            final int JAN = 31;
            final int FEB = leapYear ? 29 : 28;
            final int MAR = 31;
            final int APR = 30;
            final int MAY = 31;
            final int JUN = 30;
            final int JUL = 31;
            final int AUG = 31;
            final int SEP = 30;
            final int OCT = 31;
            final int NOV = 30;
            int totalDays = 0;
            if (dayOfYear <= (totalDays = JAN)) System.out.println("Month is January");
            else if (dayOfYear <= (totalDays  += FEB)) System.out.println("Month is February");
            else if (dayOfYear <= (totalDays += MAR)) System.out.println("Month is March");
            else if(dayOfYear <= (totalDays += APR)) System.out.println("Month is April");
            else if (dayOfYear <= (totalDays += MAY)) System.out.println("Month is May");
            else if (dayOfYear <= (totalDays += JUN)) System.out.println("Month is June");
            else if (dayOfYear <= (totalDays += JUL)) System.out.println("Month is July");
            else if (dayOfYear <= (totalDays += AUG)) System.out.println("Month is August");
            else if (dayOfYear <= (totalDays += SEP)) System.out.println("Month is September");
            else if (dayOfYear <= (totalDays += OCT)) System.out.println("Month is October");
            else if (dayOfYear <= (totalDays += NOV)) System.out.println("Month is November");
            else System.out.println("Month is December");
        }
    }
}