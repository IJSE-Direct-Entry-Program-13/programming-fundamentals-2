void main(){
    String something = "ijse abc";
    Object o = new Object();
    System.out.println(o);
    System.out.println(o.toString());

    System.out.println(something);
    System.out.println(something.toString());

    System.out.println(something.length());
    // ===================================

    String name = "     Kasun   ";
    System.out.println(name.length());
    System.out.println(name);
    System.out.println(name.stripLeading());
    System.out.println(name.stripTrailing());
    System.out.println(name.strip());
    System.out.println(name.trim());
}