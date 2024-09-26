import java.util.Scanner;

void main() {

//    do ; while (false);
//    do ; while (true);

//    do System.out.println("Hello"); while (true);

    int x = 0;
    do{
        System.out.println(STR."\{x}.Hello");
    }while (x++ < 5);

    System.out.println("-------------");

    int y = 0;
    while (y++ < 5){
        System.out.println(STR."\{y}.World");
    }

    final var SCANNER = new Scanner(System.in);
    boolean invalidMarks;
    do {
        System.out.print("Enter marks: ");
        int marks = SCANNER.nextInt();
        if (invalidMarks = marks < 0 || marks > 100){
            System.out.println("Invalid marks");
        }
    }while (invalidMarks);
}