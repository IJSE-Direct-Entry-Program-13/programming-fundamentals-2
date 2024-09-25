void main(){
    int num = 123;
    String str = num + "";
    System.out.println(str);
    String age = "10";

    int myAge = Integer.valueOf(age);
    long myLongAge = Long.valueOf(age);
    float myFloatAge = Float.valueOf(age);

    System.out.println(myAge);

    String str2 = "22.25";
    double d  = Double.valueOf(str2);
    System.out.println(str2  + 10);
    System.out.println(d + 10);

    long l = 999999999999L;
}