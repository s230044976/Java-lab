
import java.util.Scanner;
public class Q2
{
   public static void main(String [] args){
       Scanner in = new Scanner (System.in);
       
       int grade;
       System.out.println("Enter your grade 0-100: ");
       grade = in.nextInt();
       
       while(grade < 0 || grade > 100){
           System.out.println("grade must be between 0 and 100, re-enter the correct grade: ");
           grade = in.nextInt();
           
       }
       
       if (grade > 60)//no ;
       System.out.println("Congratsulations you passed the course");
       
       else
       System.out.println("you failed the course");
       
       
   }
       
   }
   

