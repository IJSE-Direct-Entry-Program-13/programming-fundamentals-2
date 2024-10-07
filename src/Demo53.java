void main(){
    outerLoop:
    for (int i = 0; i++ < 5; System.out.print("*\n")) {
        if (i == 0){
            continue;
        }else{
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
                if (j == 3) continue outerLoop;
            }
            System.out.println(". ");
        }
    }
}