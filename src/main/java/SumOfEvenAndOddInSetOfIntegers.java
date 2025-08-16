import java.util.Scanner;
public class SumOfEvenAndOddInSetOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers you want to enter:");
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        System.out.println("Enter " +n+ "integers:");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }
        System.out.println("Even Sum:"+evenSum);
        System.out.println("Odd Sum:"+oddSum);
        sc.close();
    }
}
