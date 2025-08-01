import java.util.Scanner;
public class areaTriangle {
    public static void main(String args[]) {
        // For keyboard input
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter base: ");
         int base = scanner.nextInt();

         System.out.print("Enter high: ");
         int high = scanner.nextInt();

         System.out.print("Enter side1: ");
         int side1 = scanner.nextInt();

         System.out.print("Enter side2: ");
         int side2 = scanner.nextInt();

         // area of the triangle
         double area1 = 0.5*high*base ;
         System.out.println("Enter base of the triangle = "+base);
         System.out.println("Enter high of the triangle = "+high);
         System.out.println("Area of the triangle : "+area1+" square units");

         System.out.println("------------------------------------");

         //area of the rectangle
         int area2 = side1*side2;
         System.out.println("Enter the length of the rectangle = "+base);
         System.out.println("Enter the width of the rectangle = "+high);
         System.out.println("Area of the rectangle : "+area2+" square units");


    }
}
