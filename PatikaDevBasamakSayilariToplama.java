
import java.util.Scanner;


public class PatikaDevBasamakSayilariToplama {
    public static void main(String[] args) {
        
           Scanner girdi = new Scanner(System.in);
        System.out.print("Please enter the number :");

        int num = girdi.nextInt();
        int total = 0;

        while (num != 0) {
            total += num % 10;
            num=num/10; 
        }
        System.out.println("Sum of the number :"+total);

    }
    }
    

