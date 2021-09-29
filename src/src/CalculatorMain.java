import java.util.Scanner;

public class CalculatorMain {
    public static Scanner in;
    private static int guestAge;
    private static float rate;
    private  static float discount;

    public static void main(String args[]){
        in = new Scanner(System.in);
        getInfo();
    }
    private static void getInfo(){
        int guestAge;
        float rate;
        float discount;
        System.out.println("Enter Age:");
        guestAge = in.nextInt();
        System.out.println("Enter Rate:");
        rate = in.nextFloat();
        System.out.println("Enter Discount Percentage (10% = .10) :");
        discount = in.nextFloat();

        if(guestAge >= 65){
            rate = rate*discount;
            }
        System.out.println("Total Is: " + rate);
    }
}
