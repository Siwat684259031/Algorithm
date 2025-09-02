import java.util.Scanner ;
public class BuyProduct{
    public static void main (String args[]){

         Scanner scanner =new Scanner(System.in);

         System.out.print("productName1 : ");
         String productName1 = scanner.nextLine();
         System.out.printf("productPrice1 : ");
         double productPrice1 = scanner.nextDouble();
         System.out.print("Enter quantity1 : ");
         int quantity1 = scanner.nextInt();
         scanner.nextLine();

         System.out.print("productName2 : ");
         String productName2 = scanner.nextLine();
         System.out.printf("productPrice2 : ");
         double productPrice2 = scanner.nextDouble();
         System.out.print("Enter quantity2 : ");
         int quantity2 = scanner.nextInt();
         scanner.nextLine();

         System.out.print("productName3 : ");
         String productName3 = scanner.nextLine();
         System.out.printf("productPrice3 : ");
         double productPrice3 = scanner.nextDouble();
         System.out.print("Enter quantity3 : ");
         int quantity3 = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Customer paid money : ");
         double money = scanner.nextDouble();

         System.out.println("                              ");
         System.out.println("-----------Receipt-----------");
         double total1 = productPrice1 *  quantity1 ;
         double total2 = productPrice2 *  quantity2 ;
         double total3 = productPrice3 *  quantity3 ;
         double Subtotal = total1+ total2+ total3 ;
         double vat = Subtotal * 0.07 ;
         double totalWithTax = vat + Subtotal ;
         double change = money - totalWithTax ;

         System.out.println(productName1+":" +productPrice1+ " x "+quantity1+" ="+total1+" bath" );
         System.out.println(productName1+":" +productPrice2+ " x "+quantity2+" ="+total2+" bath" );
         System.out.println(productName3+":" +productPrice3+ " x "+quantity3+" ="+total3+" bath" );
         System.out.println("Subtotal : "+Subtotal+ " bath");
         System.out.println("VAT 7% : "+vat+ " bath");
         System.out.println("Total imclubing VAT : "+totalWithTax+ " bath");
         System.out.println("Amount paid: "+money+ " bath");
         System.out.println("Change: " + String.format("%.2f", change));

    }
}