

public class Person
{
    private int id;
    private String name;
    private int age;
    
    public void setId(int x ){
        id = x;
        System.out.print(" \nSetting the ID to: " + x);
    }
    
    public void setName (String y){
        name = y;
        System.out.print(" \nSetting the name to: " + y);
    }
    
    public void setAge ( int z){
        age = z;
        System.out.print(" \nSetting the age to: " + z + "\n" );
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
}
