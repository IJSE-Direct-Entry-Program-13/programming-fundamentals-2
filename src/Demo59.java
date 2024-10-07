void main(){
    int x = 2;
    int y = x++ + --x * 2;
    int z = ~y % x;
    loop1:
    for (int i = 0; i < -z; i++) {
        loop2:
        if (i == -1) break loop2;
        for (int j = -3; j < -i; j++) {
            if (j == -1) continue loop1;
            System.out.print("* ");
        }
        System.out.println();
    }
}