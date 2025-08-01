import java.util.Scanner;
public class Tax {
    public static void main(String args[]) {
        // For keyboard input
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter money: ");
         double money = scanner.nextDouble();

         double Tax = money*10/100;

         System.out.println("Tax payable "+Tax+" baht");
    }
}
