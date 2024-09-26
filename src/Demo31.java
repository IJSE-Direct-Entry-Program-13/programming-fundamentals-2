import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);
    final var RED = "\u001B[31;1m";
    final var GREEN = "\u001B[32;1m";
    final var BLUE = "\u001B[34;1m";
    final var YELLOW = "\u001B[33;1m";
    final var RESET = "\u001B[0m";

    String name = "";
    boolean invalidName = true;

    while (invalidName) {
        System.out.print("Enter name: ");
        name = SCANNER.nextLine().strip().toUpperCase();
        if (invalidName = name.isBlank()) System.out.println(STR."\{RED}Name can't be empty\{RESET}");
        else if (invalidName = name.length() < 3) System.out.println(STR."\{RED}Invalid name\{RESET}");
    }

    int subjectCount = 0;
    boolean invalidSubjectCount = true;

    while (invalidSubjectCount) {
        System.out.print("Enter subject count: ");
        subjectCount = SCANNER.nextInt();
        SCANNER.skip(System.lineSeparator());
        if (invalidSubjectCount = subjectCount < 1 || subjectCount > 5)
            System.out.println(STR."\{RED}Subject count should be within the range 1-5\{RESET}");
    }

    int i = 0;
    String subjectDetails = "";

    while (i++ < subjectCount) {

        String subject = "";
        boolean invalidSubject = true;

        while (invalidSubject) {
            System.out.print(STR."Enter subject \{i} name: ");
            subject = SCANNER.nextLine().strip().toUpperCase();
            if (invalidSubject = subject.isBlank()) {
                System.out.println(STR."\{RED}Subject \{i} name can't be empty\{RESET}");
            } else if (invalidSubject = !(subject.equals("OOP") ||
                    subject.equals("DBMS") ||
                    subject.equals("DAS") ||
                    subject.equals("OS") ||
                    subject.equals("PF"))) {
                System.out.println(STR."\{RED}Subject \{i} name is invalid\{RESET}");
            }
        }

        int marks = 0;
        boolean invalidMarks = true;

        while (invalidMarks) {
            System.out.print(STR."Enter subject \{i} marks: ");
            marks = SCANNER.nextInt();
            SCANNER.skip(System.lineSeparator());
            if (invalidMarks = marks < 0 || marks > 100)
                System.out.println(STR."\{RED}Invalid marks for the \{subject}\{RESET}");
        }

        subjectDetails += STR."\{subject}: \{marks}\{System.lineSeparator()}";
    }

    System.out.println(STR."""
            NAME: \{name}
            \{subjectDetails}
            """);
}