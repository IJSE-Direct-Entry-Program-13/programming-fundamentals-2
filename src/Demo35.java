void main() {
    int x = 0, y = 5, w = 5;
    while (true) {
        x++;
        System.out.print(STR."* \{x < y ? "" : System.lineSeparator()}");
        if (x == y){
            x = 0;
            y--;
        }
        if (y == 0) y = --w;
        if (w == 1) return;
    }
}