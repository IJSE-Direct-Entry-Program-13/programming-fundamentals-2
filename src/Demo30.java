import java.util.Scanner;

int a;
void main(){
    int x;
    x = 10;
    System.out.println(x);

    int y;
    // y = (int) ((y) + (5))
    // y += 5;

    System.out.println(a);

    int b;
    final boolean flag = true;
    if (flag){
        b = 10;
    }
    System.out.println(b);

    String day = null;
    int input = new Scanner(System.in).nextInt();

    if (input == 1) day = "Sunday";
    else if (input == 2) day = "Monday";
    else if (input == 3) day = "Tuesday";
    else if (input == 4) day = "Wednesday";
    else if (input == 5) day = "Thursday";
    else if (input == 6) day = "Friday";
    else if (input == 7) day = "Saturday";
    else{
        // day = "Invalid day";
        System.out.println("Invalid day");
    }

    System.out.println(day);
}