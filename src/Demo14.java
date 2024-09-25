void main(){
    String name = "   kasun   ";
    System.out.println(name);
    System.out.println(name.length());
    System.out.println(name.strip());
    System.out.println(name);
    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name);
    System.out.println(name.strip() == name.strip());
    System.out.println(name.strip().equals(name.strip()));

    String institute = "    IJSE";
    System.out.println(institute);
    System.out.println(institute.strip().toLowerCase());

    String something = "Hello World!";
    System.out.println(something.substring(3,5));
    System.out.println(something.substring(6));
    System.out.println(something.substring(0,5));
    System.out.println(something);

    System.out.println(something.charAt(6));
}