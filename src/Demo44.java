void main() {
    for (int x = 0; ; x++) {
        System.out.println("Hello");
        if (x > 5) break;
    }

    // This can't be done
    // for (int a = 0, double b = 2; a < b; a++);

    // But you can do this instead
    int a;
    double b;
    for(a = 0, b = 2; a < b; a++) System.out.println(a);

    for(int k=0, l=3; k < l; k++) System.out.println(k);

    // for(int k=0, int l=3; k < l; k++) System.out.println(k);
}