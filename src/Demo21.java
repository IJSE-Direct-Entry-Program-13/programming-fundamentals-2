import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your marks1: ");
    double marks1 = scanner.nextDouble();
    System.out.print("Enter your marks2: ");
    double marks2 = scanner.nextDouble();
    System.out.print("Enter your marks3: ");
    double marks3 = scanner.nextDouble();
    double totalMarks = marks1 + marks2 + marks3;
    double avgMarks = totalMarks / 3;
    System.out.println(STR."""
            =========================
            \u001b[33;1mYOUR REPORT CARD\u001b[0m
            =========================
            \u001b[30;4mNAME: \{name.toUpperCase()}\u001b[0m
            Subject1: \{marks1}
            Subject2: \{marks2}
            Subject3: \{marks3}
            =========================
            \u001b[30;1mTotal Marks: \{totalMarks}\u001b[0m
            Avg. Marks: \{avgMarks}
            """);
}