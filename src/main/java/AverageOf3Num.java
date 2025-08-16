import java.util.Scanner;
/*public class AverageOf3Num {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int average=(a+b+c)/3;
        System.out.println("Average:" +average);
    }
}*/
public class AverageOf3Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number:");
        int a=sc.nextInt();
        System.out.println("Enter B number:");
        int b=sc.nextInt();
        System.out.println("Enter C number:");
        int c=sc.nextInt();
        double average=(a+b+c)/3;
        System.out.println("The average of a b c:" +average);
    }
}
