import java.util.Scanner;
public class BMICalculator{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height:");
        float height = scanner.nextFloat();

        System.out.print("Enter weight:");
        float weight = scanner.nextFloat();

        float BMI= weight /(height*height);
        System.out.println("Enter your weight in kilograms :"+weight);
        System.out.println("Enter your height in meters :"+height);
        System.out.println("Your BMI for weight ="+weight+" and height = "+height+" meterd is: "+BMI+" bmi.");
    }
}