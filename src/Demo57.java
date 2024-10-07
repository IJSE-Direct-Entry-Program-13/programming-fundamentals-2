void main(){
    int x = 5;
    a:
    b:
    c:
    do {
        x--;
        int a = +(-(~x)) % 3;
        for (int i = 0; i < a; i++) {
            System.out.println(i << (x < 2 ? 2 : (x = 7)));
        }
        if (x == ~6) break a;
    }while (~x > -8);
    System.out.println(x);
}