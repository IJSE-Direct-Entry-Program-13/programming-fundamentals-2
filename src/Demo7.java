import java.util.Scanner;

void main(){
    var scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Enter your address: ");
    String address = scanner.nextLine();
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println("Enter your salary: ");
    double salary = scanner.nextDouble();

    System.out.println(STR."""
            Hi \{name}!
            Your Details
            =============
            Address: \{address}
            Age: \{age}
            Salary: \{salary}
            """);
}