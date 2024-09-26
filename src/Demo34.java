void main() {
    int x = 0, w = 5, y = 0;
    while (x++ < w) {
        System.out.print(STR."* \{(x < w) ? "" : System.lineSeparator()}");
        if (x == w) {
            x = 0;
            w--;
        }
        if (w == 0) if (y < 3) w = 5 - ++y;

    }
}