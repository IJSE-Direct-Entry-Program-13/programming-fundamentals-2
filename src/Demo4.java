import java.io.IOException;

void main() throws IOException {
    System.out.println("Hello");
   //System.err.println("IJSE");

    byte byte1 = 65;
    byte byte2 = 66;
    byte byte3 = 67;
    System.out.write(byte1);
    System.out.write(byte2);
    System.out.write(byte3);
    System.out.println("ABC");
    System.out.flush();
}