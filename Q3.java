import java.util.Scanner;
public class Q3
{
   public static void main (String [] args){
       
       int number;
       Scanner in = new Scanner(System.in);
       
       System.out.println("please enter a number between 0 and 100");
       number= in.nextInt();
       
       while( number < 0 || number > 100){ // or means ||
           System.out.println("wrong number, enter the number again ");
           System.out.println("The given number must be between 0 and 100 ");
           
           number = in.nextInt();
           
       }
       
       for(int i=number;i <= 200;i++)
       System.out.println(i+ " ");
       
       
   }
}
