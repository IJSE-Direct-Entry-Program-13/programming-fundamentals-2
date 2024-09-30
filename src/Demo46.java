void main() {
//    for (int y = 0; y < 7; y++) {
//        for (int x = 0; x < 5; x++) {
//            System.out.print(STR."(\{x}, \{y}),");
//        }
//        System.out.println();
//    }

    for (int x = 0, y = 0, w = 5; y < 7;) {
        System.out.print(STR."(\{x}, \{y}),");
        if (x == w){
            y++;
            x = 0;
            System.out.println();
        }else{
            x++;
        }
    }
}