void main(){
    System.out.println("App Started");
    int i = 0;

    if (i++ > 0) System.out.println("First If");
    if (i++ < 0) System.out.println("Second If");
    if (i++ < 0) System.out.println("Third If");
    if (i++ > 0) {
        System.out.println("Fourth If");
        System.out.println("Fourth If");
        System.out.println("Fourth If");
    }
    if (i++ < 0) System.out.println("Fifth If");
    if (i++ < 0) System.out.println("Sixth If");
    else System.out.println("Last Else");

    System.out.println(i);
    System.out.println("Exited");
}