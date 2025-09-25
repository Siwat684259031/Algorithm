import java.util.Scanner;
public class MemberDiscount{
    public static void main (String []argd){
        Scanner scanner =new Scanner(System.in);

        //เลือก level ของลูกค้าเพือรับส่วนลด
       System.out.print("Enter your level (silver , Gold , Platinum , Other ): "); 
       String level=scanner.nextLine(); 

       System.out.print("Enter TotalPurchase : ");
       double totalPurchase =scanner.nextDouble();
       System.out.println("                         ");
       System.out.println("---------Receipt---------");
       
         if( level.equals("silver")){
            System.out.println("Member level : silver");
            double Discount = totalPurchase * 0.05 ;
            double finalPrice = totalPurchase -  Discount ;
            System.out.println("Total purchase : "+totalPurchase);
            System.out.println("Discount : "+Discount);
            System.out.println("Final Price : "+finalPrice);
        }  
        else if( level.equals("Gold")){
            System.out.println("Member level : Gold");
            double Discount = totalPurchase * 0.1 ;
            double finalPrice = totalPurchase -  Discount ;
            System.out.println("Total purchase : "+totalPurchase);
            System.out.println("Discount : "+Discount);
            System.out.println("Final Price : "+finalPrice);
        }
        else if( level.equals("Platinum")){
            System.out.println("Member level : Platinum");
            double Discount = totalPurchase * 0.15 ;
            double finalPrice = totalPurchase -  Discount ;
            System.out.println("Total purchase : "+totalPurchase);
            System.out.println("Discount : "+Discount);
            System.out.println("Final Price : "+finalPrice);
        }
        else{
            System.out.println("Member level : Other");
            double Discount = totalPurchase * 0 ;
            double finalPrice = totalPurchase -  Discount ;
            System.out.println("Total purchase : "+totalPurchase);
            System.out.println("Discount : "+Discount);
            System.out.println("Final Price : "+finalPrice);    
        }
    }
}