void main(){
    for (int i = 0; i < 5; i++) {
        System.out.print(STR."\nIteration \{i + 1} - ");
        if ( i == 2 || i == 3){
            continue;
        }
        System.out.println("*");
    }

    System.out.println("=================");

    loop1:
    for (int y = 0; y < 5; y++) {
        System.out.print(STR."\{y + 1}. ");
        // if (true) continue;
        loop2:
        for (int x = 0; x < 5; x++) {
            block:
            if ((y == 1 || y == 3) && x == 1) continue loop1;
            // System.out.print(STR."\{x}, ");
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println("=================");

    for (int y = 0; y < 5; y++) {
        System.out.print(STR."\{y + 1}. ");
        // if (true) continue;
        for (int x = 0; x < 5; x++) {
            if ((y == 1 || y == 3) && x == 4) break;
            System.out.print(STR."\{x}, ");
        }
        System.out.println();
    }

}