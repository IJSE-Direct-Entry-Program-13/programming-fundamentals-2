void main() {
    // 10 + 15;
    // 3 > 2;

    int x;      // Local Variable Declaration Statement;

    x = 5;      // 1. Assignment Expression Statement

    //x + 1;
    ++x;        // 2. Pre-increment Expression Statement
    x++;        // 3. Post-increment Expression Statement
    //x - 1;
    x--;        // 4. Post-decrement Expression Statement
    --x;        // 5. Pre-decrement Expression Statement

    // 6. Method Invocation Expression Statement
    System.out.println(x++);
    System.out.println(--x);
    System.out.println("Programming Fundamentals 2");
    System.out.println(10 + 15);
    System.out.println(3 > 2);
    System.out.println(x = 5);

    sum(10, 20);
    System.out.println(sum(10,20));

    print(10,20);       // void
    // System.out.println(print(10, 20));

    // 7. Class Instance Creation Expression Statement
    new A();
    System.out.println(new A());
}

class A{}

int sum(int num1, int num2){
    return num1 + num2;
}

void print(int num1, int num2){
    System.out.println(num1 + num2);
}