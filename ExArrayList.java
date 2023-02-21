import java.util.ArrayList;
import java.util.Iterator;

public class ExArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Vineet");
        obj.add("Amit");
        obj.add("Raj");
        obj.add("All are ");
        obj.add("Boys");
        System.out.println("The List Is : "+obj);
        Iterator<String> iterator = obj.iterator();
        System.out.println("The Itration is : ");
        while (iterator.hasNext())  
        System.out.println(iterator.next() + " "); 
        obj.removeIf(n->(n.charAt(0)=='R' || n.charAt(0)=='r'));
        System.out.println("The list after the Pop Operation : "+obj); 
        System.out.println("The size After Removing : "+obj.size()); 
    }
}
