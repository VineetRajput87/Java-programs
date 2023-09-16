import java.util.Scanner;
class CalculatorBy_If
{
    public static void main(String arr[ ])
    {
        int a,b,c; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        a=sc.nextInt();
        System.out.println("Enter the value of B : ");
        b=sc.nextInt();
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n ");
        System.out.println("Enter Your choice  : ");
        c=sc.nextInt();
        if(c==1)
        System.out.println("The Addition is : "+(a+b));
        else if(c==2)
        System.out.println("The Subtraction is : "+(a-b));
        else if(c==3)
        System.out.println("The Multiplication is : "+(a*b));
        else if(c==4)
        System.out.println("The Division is : "+(a/b));
        else
        System.out.println("WRONG INPUT\nTRY AGAIN...");
    }
}
