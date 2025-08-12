
import java.util.Scanner;
public class Q4Lab8
{
    public static void main(String[] args){
        
        int number;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter a number between 50 and 100 ");
        number = in.nextInt();
        
        while(number < 50 || number >100){
        System.out.println("wrong number, enter the number again ");
        System.out.println("The given number must be between 50 and 100");
        number = in.nextInt();
    }
    for(int i=0; i<= number; i=i+5)
    System.out.println(i+ " ");
}
}
