import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
        // For keyboard input
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter r: ");
         double r = scanner.nextDouble();

         final double Pi = 3.14;

        double sum = Pi*r*r;

         System.out.println("Area of circle that has rabius = 5 meters is "+sum+" square meters");
    }
}
