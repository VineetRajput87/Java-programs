import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueue 
{
    public static void main(String[] args) 
    {
        Queue<String> obj = new PriorityQueue<String>();
        obj.add("Vineet");
        obj.add("Abhay");
        obj.add("Rohit");
        System.out.println("The Queue Is : "+obj);
    }
}
