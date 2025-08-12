import java.util.Scanner;
public class Q5Lab8
{
  public static void main(String[] args){
      
      char operator;
      double number1, number2, result;
      
      Scanner input = new Scanner (System.in);
      
      do{
          System.out.println("Choose an operator: +, -, *, /");
          operator = input.next().charAt(0);
      }while(operator!='+'&&operator!='-'&&operator!='*'&&operator!='/');
      
      System.out.println("Enter first number");
      number1 = input.nextDouble();
      
      System.out.println("Enter second number");
      number2 = input.nextDouble();
      
      switch (operator){
          case '+' :
              result= number1 + number2;
              System.out.println(number1 + "+" +number2+ "=" +result);
              
              case '-' :
              result= number1 + number2;
              System.out.println(number1 + "-" +number2+ "=" +result);
              
              case '*' :
              result= number1 + number2;
              System.out.println(number1 + "*" +number2+ "=" +result);
              
              case '/' :
              result= number1 + number2;
              System.out.println(number1 + "/" +number2+ "=" +result);
      }defult 
  }
}
