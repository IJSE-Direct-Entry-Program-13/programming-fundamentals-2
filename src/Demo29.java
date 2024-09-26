import java.util.Scanner;

void main(){
    final String RED = "\u001b[31;1m";
    final String RESET = "\u001b[0m";
    var scanner = new Scanner(System.in);
    boolean invalid = true;
    String name = "";

    while (invalid) {
        System.out.print("Enter your name: ");
        name = scanner.nextLine().strip();

        if (invalid = (name.isBlank())) System.out.println(STR."\{RED}Name can't be empty\{RESET}");
        else if (invalid = (name.length() < 3)) System.out.println(STR."\{RED}Invalid name\{RESET}");
    }

    if (!invalid) System.out.println(STR."Hi \{name}!");
}