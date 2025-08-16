import java.util.Scanner;
public class CostOf3Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil cost:");
        float pencil=sc.nextFloat();
        System.out.println("Enter pen cost:");
        float pen =sc.nextFloat();
        System.out.println("Enter eariser cost:");
        float eariser = sc.nextFloat();
        float total_cost=pencil+pen+eariser;
        System.out.println("The total cost: "+total_cost);
        float gstRate=18f;
        float gstamount=(total_cost*gstRate)/100;
        float finalBill=total_cost+gstamount;
        System.out.println("Gst @" +gstRate+"%:" +gstamount);
        System.out.println("Final Bill(including gst): "+finalBill);
        sc.close();
    }
}
