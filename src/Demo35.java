void main() {
    int x = 0, w = 5, y = 5;
    while (true) {
        x++;
        System.out.print(STR."* \{x < w ? "" : System.lineSeparator()}");
        if (x == w){
            x = 0;
            w--;
        }
        if (w == 0) w = --y;
        if (y == 1) System.exit(0);
    }
}