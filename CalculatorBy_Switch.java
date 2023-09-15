import java.util.Scanner;
class CalculatorBy_Switch 
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
        switch(c)
        {
               case 1: 
               System.out.println("The Addition is : "+(a+b));
               break;
               case 2:
               System.out.println("The Subtraction is : "+(a-b));
               break;
               case 3 : 
               System.out.println("The Multiplication is : "+(a*b));
               break;
               case 4 : 
               System.out.println("The Division is : "+(a/b));
               break;
               default : 
               System.out.println("WRONG INPUT\nTRY AGAIN...");
       }
    }
}
