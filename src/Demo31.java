import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);
    final var RED = "\u001B[31;1m";
    final var GREEN = "\u001B[32;1m";
    final var BLUE = "\u001B[34;1m";
    final var YELLOW = "\u001B[33;1m";
    final var RESET = "\u001B[0m";
    final var BOLD = "\u001B[1m";
    final var UNDERLINE = "\u001B[4m";

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
    int totalMarks = 0;

    int maxMarks = 0;
    String maxMarksSubject = "";

    int minMarks = 100;
    String minMarksSubject = "";

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

        String grade;
        if (marks >= 75) grade = STR."\{BLUE}A\{RESET}";
        else if (marks >= 65) grade = STR."\{GREEN}B\{RESET}";
        else if (marks >= 55) grade = STR."\{YELLOW}C\{RESET}";
        else if (marks >= 45) grade = "S";
        else grade = STR."\{RED}F\{RESET}";

        subjectDetails += STR."\{subject}-\{marks} (\{grade})\{System.lineSeparator()}";
        totalMarks += marks;

        if (marks >= maxMarks) {
            maxMarks = marks;
            maxMarksSubject = subject;
        }

        if (marks <= minMarks){
            minMarks = marks;
            minMarksSubject = subject;
        }
    }

    double avgMarks = totalMarks / (subjectCount * 1.);
    String grade;
    if (avgMarks >= 75) grade = STR."\{BLUE}A\{RESET}";
    else if (avgMarks >= 65) grade = STR."\{GREEN}B\{RESET}";
    else if (avgMarks >= 55) grade = STR."\{YELLOW}C\{YELLOW}";
    else if (avgMarks >= 45) grade = "S";
    else grade = STR."\{RED}F\{RESET}";

    System.out.println(STR."""

            \{BOLD}NAME: \{UNDERLINE}\{name}\{RESET}
            \{subjectDetails}
            \{BOLD}TOTAL MARKS: \{totalMarks}
            AVG. MARKS: \{avgMarks}
            GRADE: \{grade}\{RESET}

            Max Marks: \{maxMarksSubject} - \{maxMarks}
            Min Marks: \{minMarksSubject} - \{minMarks}

            """);
}