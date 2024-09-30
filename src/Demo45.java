void main() {
    int k = 0;
    for (int y = 0; y < 7; y++) {
        for (int x = 0; x < 7; x++) {
            System.out.print(x >= (3 - k) && x <= (3 + k) ? "* " : ". ");
        }
        if (y < 3) k++;
        else k--;
        System.out.println();
    }
}