import java.util.Scanner;
public class Lab5Q3 {
   public static void main (String [] args){
       int num;
       //creating obejct of class scanner
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number to cheak if it is positive or not");
       num = sc.nextInt();
       isPositive (num);
       //saves the vaule from the user
       
       
}

public static void isPositive (int y){
    if (y>0)
    System.out.println("The number is positive");
    else if (y<0)
    System.out.println("the number is negtive");
    else
    System.out.println("the number is zero");
    
}

}

