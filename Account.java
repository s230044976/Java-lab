//set and get
public class Account
{
   String name;
   int age;
   
    public static void main(String [] args){
        
        Account a = new Account();
        a.setName("Rahaf");
        a.setAge(20); 
        System.out.println(a.getName());
        System.out.println(a.getAge());
       a.printDetails();
        
    }
    public void setName( String name){
        this.name = name;// it tells the computer we are refering to the instance varible
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printDetails(){
        System.out.println(name + ", " + age);
        
    }
    
}
