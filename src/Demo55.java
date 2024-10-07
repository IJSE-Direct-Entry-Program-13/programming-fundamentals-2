void main(){
    int total = 0;
    outerLoop:
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; i++) {
            System.out.println(STR."(i,j)=(\{i},\{j})");
            total += i + ++j;
            if (total > 5) continue outerLoop;
        }
        System.out.println(total);
    }
    System.out.println(total);
}