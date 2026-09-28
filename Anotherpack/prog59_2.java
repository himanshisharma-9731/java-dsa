package Anotherpack;
import mypackage.prog59_1;

public class prog59_2 {
    public static void main(String[] args) {
        prog59_1 obj = new prog59_1();   // must create object since display() is non-static
        obj.display();
    }
}