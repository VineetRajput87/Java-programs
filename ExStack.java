import java.util.Stack;

public class ExStack 
{ 
    public static void main(String[] args) 
    { 
        Stack<String> obj = new Stack<String>();
        
        obj.push("Vineet");
        obj.push("Kanha");                                    
        obj.push("Tahir"); 
        obj.push("Mohit"); 
        obj.push("Ram"); 
        System.out.println("The list is : "+obj); 
        System.out.println("The size is : "+obj.size()); 
        obj.pop();
        System.out.println("The List After Pop Operation : "+obj); 
        System.out.println("The Size After Pop Operation "+obj.size()); 

    }
}
