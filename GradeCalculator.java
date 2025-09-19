import java.util.Scanner;
public class GradeCalculator{
    public static void main (String []argd){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Score : ");
        int score =scanner.nextInt();

        System.out.println("              ");
        System.out.println("---Result---");

        if((score<=0)||(score>100)){
            System.out.println("Noo");
        }
        else if(score >= 80){
            System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("Grade : A");
        }
        else if(score >= 70){
             System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("Grade : B");
        }
        else if(score >= 60){
            System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("Grade : D");
        }
        else if(score >= 50){
            System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("Grade : C");
        }
        else{
             System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("“Grade : E”");
        }
    }
}