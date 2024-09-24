import java.util.Scanner;

void main(){
    System.out.println("Enter something");

    var scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(input);
}