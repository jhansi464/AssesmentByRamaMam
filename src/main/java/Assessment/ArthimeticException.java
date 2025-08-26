package Assessment;
import java.util.*;
public class ArthimeticException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arthimetic Exception Caught!!!" +e.getMessage());
        }
    }
}
