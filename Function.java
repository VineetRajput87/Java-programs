import java.util.Scanner;
public class Function 
{
    void f1() 
    {
        System.out.println("Hello");
    }
    void f2(int b,int c) 
    {
        System.out.println("The Addition is : "+(b+c));
    }
    int f3(int a,int b)
    {
        return (a*b);
    }
    public static void main(String arr[])
    {
       Function obj = new Function();
       int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A : ");
       a=sc.nextInt();
       System.out.println("Enter B : ");
       b=sc.nextInt();

       obj.f1();
       obj.f2(a,b);
       System.out.println("The Multiplication is : "+obj.f3(a,b));
    }
}
