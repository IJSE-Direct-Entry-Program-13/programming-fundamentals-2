void main() {
    String str = "abc";
    // Java SE 11
    System.out.println(str.repeat(5));

    int x = 0;
    while (x++ < 3) System.out.println("* ".repeat(5));
    System.out.println("---------------");

    int a = 0;
    while (a++ < 5) {
        int b = 0;
        while (b++ < a) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("---------------");

    x = 0;
    while (x++ < 5) System.out.println("* ".repeat(x));
    System.out.println("---------------");


    a = 0;
    while (a < 5) {
        int b = 5;
        while (b-- > a) {
            System.out.print("* ");
        }
        System.out.println();
        a++;
    }
    System.out.println("---------------");

    x = 5;
    while (x > 0) System.out.println("* ".repeat(x--));
    System.out.println("---------------");

    x = 5;
    while (x > 0) System.out.println("* ".repeat(x--));
    x = 0;
    while (x++ < 5) System.out.println("* ".repeat(x));
    System.out.println("---------------");

    x = 0;
    boolean reverse = false;
    while (x < 10) {
        System.out.println("* ".repeat(!reverse ? 5 - x++ : (++x - 5)));
        if (5 - x == 0) {
            reverse = true;
            x++;
        }
    }

    System.out.println("---------------");
    a = 0;
    int b = 5;
    boolean flag = false;
    while (a++ < b && b < 6) {
        System.out.print(STR."* \{a < b ? "" : System.lineSeparator()}");
        if (a == b) {
            a = 0;
            if (!flag) b--;
            else b++;
        }
        if (b == 0) {
            flag = true;
            a = 0;
            b += 2;
        }
    }
}