void main() {
//    for (int y = 0; y < 7; y++) {
//        for (int x = 0; x < 5; x++) {
//            System.out.print(STR."(\{x}, \{y}),");
//        }
//        System.out.println();
//    }

    for (int x = 0, y = 0, w = 1, spaceCount = 0,
         line = 1, lineIncrement = 3; y < 20; ) {

//        if (x == w) {
//            System.out.println();
//        } else {
//            if (x == y && y == line) {
//                System.out.print("| ");
//            } else {
//                if (x < spaceCount || y == line) {
//                    System.out.print(". ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//        }

        System.out.print(x == w? System.lineSeparator():
                x == y && y == line? "| ":
                        x < spaceCount || y == line? ". ": "* ");

        if (x == w) {
            if (y == line) {
                line += lineIncrement++;
                spaceCount = y + 1;
            }
            y++;
            x = 0;
            w++;
        } else {
            x++;
        }
        if (y == 1) spaceCount = 1;
    }
}