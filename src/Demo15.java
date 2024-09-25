void main() {
    String str1 = "hello";
    String str2 = str1.toUpperCase();
    String str5 = "HELLO";
    System.out.println(str2);
    String str3 = str1.toUpperCase().intern();
    System.out.println(str3);
    String str4 = str1.toUpperCase().intern();
    System.out.println(str4);
    System.out.println(str2.equals(str3));
    System.out.println(str2.equals(str4));
    System.out.println(str3.equals(str4));
    System.out.println(str2.equals(str5));
    System.out.println(str3.equals(str5));
    System.out.println(str4.equals(str5));
    System.out.println("----------------");
    System.out.println(STR."str2 == str3? \{str2 == str3}");
    System.out.println(STR."str2 == str4? \{str2 == str4}");
    System.out.println(STR."str3 == str4? \{str3 == str4}");
    System.out.println(STR."str2 == str5? \{str2 == str5}");
    System.out.println(STR."str3 == str5? \{str3 == str5}");
    System.out.println(STR."str4 == str5? \{str4 == str5}");
}