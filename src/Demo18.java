void main() {

    if (true) ;
    else if (true) ;
    else if (false) ;
    else ;

    System.out.println("App Started");
    int i = 0;

    if (i++ > 0) System.out.println("First If");
    else if (i++ < 0) System.out.println("Second If");
    else if (i++ < 0) System.out.println("Third If");
    else if (i++ > 0) {
        System.out.println("Fourth If");
        System.out.println("Fourth If");
        System.out.println("Fourth If");
    }
    else if (i++ < 0) System.out.println("Fifth If");
    else if (i++ < 0) System.out.println("Sixth If");
    else System.out.println("Last Else");

    System.out.println(i);
    System.out.println("Exited");
}