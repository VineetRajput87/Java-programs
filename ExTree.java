import java.util.Scanner;
import java.util.TreeSet;
public class ExTree  
{
    public static void main(String[] args) 
    {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        n=sc.nextInt();
        TreeSet<Integer> obj = new TreeSet<Integer>();        
        for(int i=0;i<n;i++)
        {
            int r;
            r=sc.nextInt();
            obj.add(r);
        
        }
        System.out.println("The sorted List Is : "+obj);
        // System.out.println("The sorted List Is : "+obj);
    }
}
