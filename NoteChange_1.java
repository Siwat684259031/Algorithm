import java.util.Scanner;
public class NoteChange_1{
    public static void main(String []args){
     Scanner scanner = new Scanner (System.in);

     //จำนวนเงินที่ลูกค้าต้องจ่าย
     System.out.print("Enter amount to pay : ");
     int pay =scanner.nextInt();

     int Change= 1000 - pay ;
     System.out.println("Change is : "+Change);

     int fiveHundred = Change/500 ;
      Change = Change % 500 ;

     int oneHundred = Change /100 ;
     Change = Change % 100 ;

     int fifty = Change/50 ;
      Change = Change % 50 ;

     int twenty = Change/20 ;
      Change = Change % 20 ;

     int tenCoin = Change/10 ;
      Change = Change % 10 ;

     int fiveCoin = Change/5 ;
      Change = Change % 5 ;

     int twoCoin = Change/2 ;
      Change = Change % 2 ;

     int oneCoin = Change ;

     System.out.println("FiveHundred note : "+fiveHundred+" note(s)");
     System.out.println("oneHundred note : "+oneHundred+" note(s)");
     System.out.println("fifty note : "+fifty+" note(s)");
     System.out.println("twenty note : "+twenty+" note(s)");
     System.out.println("tenCoin note : "+tenCoin+" note(s)");
     System.out.println("fiveCoin note : "+fiveCoin+" note(s)");
     System.out.println("twoCoin note : "+twoCoin+" note(s)");
     System.out.println("oneCoin note : "+oneCoin+" note(s)");
    }
}