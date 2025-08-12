

public class Lab5
{
    //this is a method to compute the power of number
public static void ComputePower(int base  , int y){
    long result = base; 
    for (int i=1 ; i<y;  i++)
    {
        result = result *base;
    }
  System.out.println( base + "to the power of " + y + "is" +" "+ result);  
}
   public static void main (String [] args) {
       ComputePower(5,2);
       ComputePower(2,2);
       ComputePower(3,10);
       ComputePower(9,3);
       
       System.out.println("The result of calling the product method is"+ Product(10,4,5));
   }
   
   public static int Product(int x , int y, int z){
       return (x*y*z);
       
    }

}
