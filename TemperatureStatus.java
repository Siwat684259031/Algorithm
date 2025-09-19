import java.util.Scanner;
public class TemperatureStatus{
    public static void main (String []argd){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter temperature in Celsius : ");
        int temperature =scanner.nextInt();
        System.out.println("temperature : "+temperature+" C");

        if((temperature>=20 )&&(temperature<=35)){
            System.out.println("“Status Normal”");
        }
        else if(temperature < 20 ){
            System.out.println("“Status Cold”");
        }
        else if(temperature > 35){
            System.out.println("“Status  Hot”");
        }
    }
}