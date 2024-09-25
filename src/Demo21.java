import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine().strip();
    if (name.isBlank()) {
        System.out.println("\u001b[31;1mName can't be empty\u001b[0m");
        System.exit(1);
    }else if (name.length() < 3) {
        System.out.println("\u001b[31;1mInvalid name\u001b[0m");
        System.exit(1);
    }
    System.out.print("Enter your marks1: ");
    double marks1 = scanner.nextDouble();
    if (marks1 < 0 || marks1 > 100) {
        System.out.println("\u001b[31;1mInvalid subject 1 marks\u001b[0m");
        System.exit(1);
    }
    System.out.print("Enter your marks2: ");
    double marks2 = scanner.nextDouble();
    if (marks2 < 0 || marks2 > 100) {
        System.out.println("\u001b[31;1mInvalid subject 2 marks\u001b[0m");
        System.exit(1);
    }
    System.out.print("Enter your marks3: ");
    double marks3 = scanner.nextDouble();
    if (marks3 < 0 || marks3 > 100) {
        System.out.println("\u001b[31;1mInvalid subject 3 marks\u001b[0m");
        System.exit(1);
    }
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