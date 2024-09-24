void main(){
    int x = 5;
    int y = 2;
    int result1 = x++ + ++y;
    int result2 = result1 * 2 + 4;

    System.out.println("Before assertion");
    assert result1 == 8: "Result-1 Assertion";
    assert result2 == 20: "Result-2 Assertion";
    System.out.println("After assertion");

    System.out.println(STR."Result1: \{result1}");
    System.out.println(STR."Result2: \{result1}");
}