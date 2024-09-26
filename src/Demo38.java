void main() {

    int x = 0;
    int y = 1;
    String star = "*";

    do {
        x++;
        System.out.print(STR."\{star} \{x == y ? "\n" : ""}");
        if (x == y) {
            x = 0;
            y++;
        }
        if (y == 6) x = y;
    } while (x < y);

    x = 0;
    y = 4;

    do {
        x++;
        System.out.print(STR."\{star} \{x == y ? "\n" : ""}");
        if (x == y) {
            x = 0;
            y--;
        }
    } while (x < y);
}