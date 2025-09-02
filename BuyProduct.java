import java.util.Scanner ;
public class BuyProduct{
    public static void main (String args[]){

         Scanner scanner =new Scanner(System.in);

         System.out.print("productName1 : ");
         String productName1 = scanner.nextLine();
         System.out.printf("product1 : ");
         double product1 = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("productName2 : ");
         String productName2 = scanner.nextLine();
         System.out.printf("product2 : ");
         double product2 = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("productName3 : ");
         String productName3 = scanner.nextLine();
         System.out.printf("product3 : ");
         double product3 = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("Customer paid money : ");
         double money = scanner.nextDouble();

         System.out.println("-----------Receipt-----------");
         double totalPricre = product1+product2+product3 ;
         double VAT = totalPricre*0.07 ;
         double totalWithTax =  totalPricre +VAT ;
         double change = money - totalWithTax ;


         System.out.println(productName1+":" +product1+ " bath");
         System.out.println(productName2+":" +product2+ " bath");
         System.out.println(productName3+":" +product3+ " bath");
         System.out.println("Total pricre before tax "+totalPricre+ " bath");
         System.out.println("VAT = "+VAT+ " bath");
         System.out.println("totalWithTax "+totalWithTax+ " bath");
         System.out.println("totol paid "+money+ " bath");
         System.out.println("Change "+change+ " bath");

    }
}