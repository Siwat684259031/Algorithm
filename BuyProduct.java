import java.util.Scanner ;
public class BuyProduct{
    public static void main (String args[]){

         Scanner scanner =new Scanner(System.in);


         System.out.print("Enter productName1 : ");
         String productName1 = scanner.nextLine();

         System.out.print("Enter productName2 : ");
         String productName2 = scanner.nextLine();

         System.out.print("Enter productName3 : ");
         String productName3 = scanner.nextLine();

         System.out.print("Enter product1 : ");
         double product1 = scanner.nextDouble();

         System.out.print("Enter product2 : ");
         double product2 = scanner.nextDouble();

         System.out.print("Enter product3 : ");
         double product3 = scanner.nextDouble();

         double totalPricre = product1+product2 ;
         double VAT = totalPricre*0.07 ;

         
         


    }
}