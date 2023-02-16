import java.util.Scanner;
public class ParaConstructor 
{
    ParaConstructor(int a, int b)
    {
        System.out.println("The Addition is : "+(a+b));
    }
    public static void main(String ar[])
    {
        int p;
        int q;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of P : ");
        p=sc.nextInt();
        System.out.println("Enter the value of Q : ");
        q=sc.nextInt();
        ParaConstructor obj =new ParaConstructor(p,q);
    }
}
