void main() {
    int i = 0;
    boolean star = true;
    int x = 0;
    int w = 5;
    int rows = 5;
    while (++i <= 5 * 14) {
        x++;
        System.out.print(STR."\{star ? "*" : " "} \{i % 5 == 0 ? System.lineSeparator() : ""}");
        if (x == w) {
            star = false;
            w--;
        }
        if (i % 5 == 0) {
            star = true;
            x = 0;
            if (w == 0) w = --rows;
        }
    }
}