
void main() {
    String emptyString = "";
    System.out.println(emptyString.length());
    System.out.println(emptyString.isEmpty());
    System.out.println(emptyString.isBlank());

    System.out.println("======================");

    String str2 = "       ";


    String input1 = "Hello";
    String input2 = "     ";

    System.out.println(input1.strip().length());
    System.out.println(input2.strip().length());

    // Since Java 6
    System.out.println(STR."Is input1 empty? \{input1.strip().isEmpty()}");
    System.out.println(STR."Is input2 empty? \{input2.strip().isEmpty()}");

    // Since Java 11
    System.out.println(STR."Is input1 blank? \{input1.isBlank()}");
    System.out.println(STR."Is input2 blank? \{input2.isBlank()}");
}