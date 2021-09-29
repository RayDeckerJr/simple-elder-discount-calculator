import java.util.Scanner;
public class CalculatorMain {
    public static Scanner in;
    private static int guestAge;
    private static int rate;

    public static void Main(String args[]){
        in = new Scanner(System.in);
        calculate();
    }
    private static void calculate(){
        int guestAge;
        int rate;
        System.out.println("Enter Age:");
        guestAge = in.nextInt();
        System.out.println("Enter Rate:");
        rate = in.nextInt();
        if (guestAge >= 65){

        }
    }
}
