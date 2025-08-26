package Assessment;
import java.util.*;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arthimetic Exception caught!!!"+e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound Exception Caught!!!"+e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception Caught!!!"+e.getMessage());
        }
    }
}
