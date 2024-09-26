import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    final String COLOR_RED = "\u001b[31;1m";
    final String RESET = "\u001b[0m";

    System.out.print("Enter your nic: ");
    String nic = scanner.nextLine().strip().toUpperCase();
    if (nic.isBlank()) {
        System.out.println(STR."\{COLOR_RED}NIC can't be empty\{RESET}");
    } else {
        boolean newNic;
        if ((newNic = (nic.length() == 12)) || (nic.length() == 10 && nic.charAt(9) == 'V')){
            System.out.println(newNic ? "New NIC": "Old NIC");
        }else{
            System.out.println(STR."\{COLOR_RED}Invalid NIC\{RESET}");
        }
    }
}