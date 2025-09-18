import java.util.Scanner;
public class Swap{
    public static void main (String []args){
        Scanner scanner =new Scanner (System.in);

         System.out.print("Enter number1: ");
         int number1  =scanner.nextInt();
         
         System.out.print("Enter number2 : ");
         int number2  =scanner.nextInt();

         System.out.println("Current -> number1 = "+number1+" and number2 = "+number2);
         if(number1 != number2){
             number1 = number1 ^ number2;
             number2 = number1 ^ number2;
             number1 = number1 ^ number2;
             System.out.println("                       ");
             System.out.println("Swapping ............ ");
             System.out.println("                       ");
             System.out.println("Now -> number 1 = "+number1+" and number 2 = "+number2 );
         }
         else{
            System.out.println("Current -> number1 = "+number1+" and number2 = "+number2);
         }
    }
}