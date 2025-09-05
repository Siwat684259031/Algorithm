import java.util.Scanner;
public class Score{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter midterm :");
         double midterm =scanner.nextDouble();

         System.out.print("Enter Final :");
         double Final =scanner.nextDouble();
         double score = midterm + Final ;

        if (score >= 50){
            System.out.println("The totla score is "+score+". print The result is Pass!!");
        }
        else{
            System.out.println("The totla score is "+score+". print The result is Fail!!");
        }
    }
}