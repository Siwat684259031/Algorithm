import java.util.Scanner;
public class BodySurfaceArea{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter width :");
        int width =scanner.nextInt();

        System.out.print("Enter length :");
        int length =scanner.nextInt();

        //float BSA = (length * width)/360.0f ;
        double BSA = (length * width)/360.0 ;
        System.out.print("Your BSA is = "+BSA);
    }
}