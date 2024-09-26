void main(){
    System.out.println("Started");
    //boolean flag = true;
    int x = 0;
    while (x++ < 5) System.out.println("Hello");
    System.out.println("World");
    System.out.println("Exited");
    System.out.println("1. -----------------");
    x = 25;
    while (x-- > 16) System.out.print(STR."\{x+1},");
    System.out.println("\b");
    System.out.println("2. -----------------");
    x = 26;
    while (x-- > 17) System.out.print(STR."\{x},");
    System.out.println("\b");
    System.out.println("3. -----------------");
    x = 0;
    while (x < (26 - 17)) System.out.print(STR."\{25 - x++},");
    System.out.println("\b");
    System.out.println("4. -----------------");
    x = 25;
    while (x != 16) System.out.print(STR."\{x--},");
    System.out.println("\b");
    System.out.println("5. -----------------");
    x = 125;
    while (x != 116) System.out.print(STR."\{x-- - 100},");
    System.out.println("\b");
}