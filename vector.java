import java.util.Vector;
public class vector 
{
    public static void main(String[] args)
    {
        Vector <Integer> obj = new Vector<Integer>(); 
        System.out.println("The Capacity of Vector 1 : "+obj.capacity());
         
        Vector <Integer> obj1 = new Vector<Integer>(3,5);

        obj1.add(1);
        obj1.add(3);
        obj1.add(34);
        obj1.add(15);
        System.out.println("Elements of Vector 2 : ");
        for(int i:obj1)
        {
            System.out.print(i+" ");                    
        }
        System.out.println();
        System.out.println("The Capacity of Vector 2 : "+obj1.capacity());
    }
}
