
public class Pen
{
    private int id;
    private String color;
    
    public Pen(){
        id = 0;
        color = "";//empty string
        
    }
    public Pen(int id, String color){
        this.id = id;
        this.color = color;
        
    }
    
    //methoeds
    public void setColor(String w)
    {
        color = w;
        
    }
    public void setId(int w)//void so no return
    {
        id = w;
        
    }
    
    public int getId()//int to return
    {
        return id;
        
    }
    
    public String getColor()
    {
        return color;
    }
    
}


