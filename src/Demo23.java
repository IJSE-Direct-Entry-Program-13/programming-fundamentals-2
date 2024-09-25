import java.util.Scanner;

void main(){
    var scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    if (year < 1800 || year > 2024){
        System.out.println("\u001b[31;1mInvalid year, year should be between 1800 and 2024\u001b[0m");
    }else{
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        final String COLOR_GREEN = "\u001b[32;1m";
        final String COLOR_BLUE = "\u001b[34;1m";
        final String RESET = "\u001b[0m";
        System.out.println(STR."\{leapYear ? COLOR_GREEN :
                COLOR_BLUE}\{year} is \{!leapYear ? "not": "\b"} a leap year \{RESET}");
    }
}