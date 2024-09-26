import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = SCANNER.nextLine();
    System.out.print("Enter your age: ");
    int age = SCANNER.nextInt();
    SCANNER.skip(System.lineSeparator());
    System.out.print("Enter your contact: ");
    String contact = SCANNER.nextLine();

    System.out.println(name);
    System.out.println(age);
    System.out.println(contact);
}