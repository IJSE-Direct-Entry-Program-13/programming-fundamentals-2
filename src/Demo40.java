import java.util.Scanner;

void main() throws Exception{
    final var SCANNER = new Scanner(System.in);
    String name;
    boolean invalidName;
    do {
        System.out.print("Enter your name: ");
        name = SCANNER.nextLine().strip();
        if (invalidName = name.isBlank()){
            System.out.println("Name can't be empty");
        }else if (invalidName = name.length() < 3){
            System.out.println("Invalid name");
        }
    }while(invalidName);

    name = STR."Hello \{name}! ";

    int i = 0;
    boolean reverse = false;
    while (true){
        if (reverse){
            i--;
            System.out.print("\b \b");
        }else{
            System.out.print(name.charAt(i++));
        }
        if (i == name.length()) {
            reverse = true;
        }else if(i == 0){
            reverse = false;
        }
        Thread.sleep(50);
    }
}