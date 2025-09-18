import java.util.Scanner;
public class BMRTool{
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);

         System.out.print("Enter your sex (m/f): "); 
         char gender=scanner.next().charAt(0);
         if(gender=='m'){
            System.out.print("Enter weight : ");
            double weight =scanner.nextDouble();

            System.out.print("Enter height  : ");
            double height  =scanner.nextDouble();

            System.out.print("Enter age : ");
            double age =scanner.nextDouble();

            //การคำนวนค่า BMR เพศชาย
            double BRMm = 66 +(13.7* weight)+(5* height)-(6.8* age) ;
            System.out.printf("Your BMR is %.2f kcal/day.\n", BRMm);
    }
    else{
            System.out.print("Enter weight : ");
            double weight =scanner.nextDouble();

            System.out.print("Enter height  : ");
            double height  =scanner.nextDouble();

            System.out.print("Enter age : ");
            double age =scanner.nextDouble();

            //การคำนวนค่า BMR เพศหญิง
            double BRMf = 655 +(9.6+ weight) +(1.8* height) -(4.7* age)  ;
            System.out.printf("Your BMR is %.2f kcal/day.\n", BRMf);
    }
    }
}