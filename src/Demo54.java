import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    while (true){
        System.out.print("Enter a number: ");
        if (SCANNER.nextInt() > 10){
            continue;
        }else if (SCANNER.nextInt() == -1){
            break;
        }
        System.out.println("Next");
    }
    System.out.println("Exited");
}