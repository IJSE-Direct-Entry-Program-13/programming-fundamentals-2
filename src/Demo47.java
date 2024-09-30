import java.util.Scanner;

void main() {
    final var BLUE = "\u001b[34m";
    final var RESET = "\u001b[0m";
    final var SCANNER = new Scanner(System.in);
    int size;
    System.out.print("Enter the pattern size (9x9)? ");
    String sizeInput = SCANNER.nextLine().trim();
    String message;
    if (sizeInput.isBlank()) {
        message = "Default size (9x9) is selected";
        size = 9;
    } else {
        size = Integer.valueOf(sizeInput);
        if (size < 9) {
            message = "Default size (9x9) is selected";
            size = 9;
        } else {
            if ((size - 9) % 2 == 0){
                message = STR."Size (\{size}x\{size}) is selected";
            }else{
                size--;
                message =STR."Size (\{size}x\{size}) is selected";
            }
        }
    }
    System.out.println(STR."\{BLUE}\{message}\{RESET}");

    for (int i = 0,x = 0, y = 0; i < (size+1) * size; i++, x++) {
        System.out.print(STR."(\{x},\{y})");
        if (x == size){
            System.out.println();
           y++;
           x = 0;
        }
    }
}