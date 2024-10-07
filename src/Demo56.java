void main() {
    a:
    b:
    for (int i = 0; i < 2; i++) {
        int x = 0;
        c:
        do {
            x++;
            if (i == 1) break c;
            System.out.println(STR."x=\{x}");
            if (x == i) continue b;
        } while (x < 3);
        System.out.println(STR."i=\{i}");
    }
}