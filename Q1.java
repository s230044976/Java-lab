import java.util.Scanner;
public class Q1
{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Enter the postitive number 1: ");
        num1 = in.nextInt();
        
        while (num1 < 0){
           System.out.print("You entered a negative number ");
           System.out.println("Re-enter The number again");
           num1 = in.nextInt();
           
        }
        
        System.out.println("Enter the positive number 2: ");
        num2 = in.nextInt();
        
        while (num2 < 0){
            System.out.println("You entered a nagtive number ");
            System.out.println("Re-enter the number again");
            num2 = in.nextInt();
            
        }
        
        System.out.println(num1 + "+" + num2+ " = "+(num1 + num2) );
        
    }
}
