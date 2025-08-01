import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        // For keyboard input
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter num1: ");
         int num1 = scanner.nextInt();

         System.out.print("Enter num2: ");
         int num2 = scanner.nextInt();

         System.out.print("Enter num3: ");
         int num3 = scanner.nextInt();

         System.out.print("Enter num4: ");
         int num4 = scanner.nextInt();

         System.out.print("Enter num5: ");
         int num5 = scanner.nextInt();

         System.out.println("number = "+num1+","+num2+","+num3+","+num4+","+num5);

         int sum = num1+num2+num3+num4+num5 ;
         System.out.println("sum = "+sum);

         int average = sum/5 ;
         System.out.println("average = "+average);
    }
}
