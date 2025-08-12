import java.util.Scanner;
public class Lab5Q4
{ public static void StudentInfo(String Lname, String Fname, int year){
    System.out.println(Fname + ""+ Lname+ "-" + year + "years old" );
}
public static int getSquare(int x){
    return x*x;
}

   public static void main (String[]args){
       StudentInfo("Alzahrani", "Rahaf", 20 );
       StudentInfo("Alzahrani", "Demma", 8 );
       StudentInfo("Alzahrani", "Raghad", 19 );
       
       System.out.println(getSquare(9));
   }
}
