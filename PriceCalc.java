import java.util.Scanner;
public class PriceCalc{
    public static void main (String []args){
        Scanner scanner =new Scanner (System.in);

         System.out.print("Enter the price of the product (per unit) : ");
         double quantity  =scanner.nextDouble();
         
         System.out.print("Enter the quantity of the product  : ");
         int product  =scanner.nextInt();

         double price = quantity * product ;
         if(product > 10){
            double finalPrice = price * 0.90 ; 
            System.out.println("You get a 10% discount!!!");
            System.out.println("Total price : "+finalPrice+" Baht");
         }
         else{
            System.out.println("Total price : "+price+" Baht");
         }
    }
}