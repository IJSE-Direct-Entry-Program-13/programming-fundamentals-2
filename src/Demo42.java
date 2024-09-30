void main() {
    int x = 0;
    for (
            System.out.println("Begin1"),System.out.println("Begin2") ;     // 1. Init
            x++ < 5;                                                        // 2. Condition
            System.out.println("Update1"), System.out.println("Update2")    // 3. Update
        ){
        System.out.println("Hello");
    }
}