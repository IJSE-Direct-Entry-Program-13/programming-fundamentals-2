void main(){
    outerLoop:
    for (int y = 0; y < 5; y++) {
        int x = 0;
        newLine:
        {
            System.out.println();
            innerLoop:
            while (x++ < 5) {
                innerMost:
                if (x >= 4 && (y == 1 || y == 3)) {
                    break outerLoop;
                }
                print:
                System.out.print("* ");
            }
            //
            System.out.println("Execution Point 1");
        }
        //
        System.out.println("Execution Point 2");
    }
    //
    System.out.println("Execution Point 3");
}