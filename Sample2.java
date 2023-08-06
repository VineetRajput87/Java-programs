import java.util.Scanner; 
public class Sample2 
{
    int a,b,c;
    void get()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : "); 
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();
        System.out.print("Enter c : ");
        c=sc.nextInt();
        
    }
    void show()
    {
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("C : "+c);
    }
    public static void main(String arr[])
    {
        Sample2 obj = new Sample2();
        obj.get();
        obj.show();
    } 
}
