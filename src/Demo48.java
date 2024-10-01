void main(){
    identifier1:
    identifier2:
    identifier3:
        System.out.println("Hello");

    // You can't label local variable declaration statements
//    ijse:
//    int a = 10;

    a:
    System.out.println("Hello");

    a:
    System.out.println("IJSE");

    a:
    System.out.println("This is crazy");

    a:{
        System.out.println("This is a block");
        // a: // Reason for this???
        System.out.println("Test");
    }

    ijse:
        //ijse:
            dep:
                System.out.println("DEP-12");

    // 10Dep:       ❌
    // _:           ❌ (since Java 9)
    // $:           ✔
    // hello$world: ✔
     hello_world:
    System.out.println("Hello World");

}