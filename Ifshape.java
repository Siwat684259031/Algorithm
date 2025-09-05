import java.util.Scanner;
public class Ifshape{
    public static void main (String [] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter number 1 or 2 :");
        int number =scanner.nextInt();

        if(number==1){
            System.out.println("areaTringle");
         System.out.print("Enter base: ");
         int base = scanner.nextInt();

         System.out.print("Enter high: ");
         int high = scanner.nextInt();

         // area of the triangle
         double area1 = 0.5*high*base ;
         System.out.println("Enter base of the triangle = "+base);
         System.out.println("Enter high of the triangle = "+high);
         System.out.println("Area of the triangle : "+area1+" square units");

        }
        if(number==2){
         System.out.println("BMI");
         System.out.print("Enter high:");
         float hight = scanner.nextFloat();

         System.out.print("Enter weight:");
         float weight = scanner.nextFloat();

         float BMI= weight /(high*high);
         System.out.println("Enter your weight in kilograms :"+weight);
         System.out.println("Enter your high in meters :"+high);
         System.out.println("Your BMI for weight ="+weight+" and high = "+high+" meterd is: "+BMI+" bmi.");
        }
    }
}