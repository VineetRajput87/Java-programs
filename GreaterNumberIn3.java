import java.util.Scanner;
class GreaterNumber
{
    int a,b,c;
    void compare() 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        a=sc.nextInt();
        System.out.println("Enter Value of B : ");
        b=sc.nextInt();
        System.out.println("Enter Value of C : ");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.println("Greater Value is : "+a);
            else 
            System.out.println("Greater Value is : "+c);
        }
        else if(b>c)
        {   
            if(b>a)    
            System.out.println("Greater Value is : "+b);
            else
            System.out.println("Both values are Equal"+a);
        }
        else
         System.out.println("Greater Value is : "+c);
        }
    public static void main(String[] args) 
    {
        GreaterNumber obj = new GreaterNumber();
        obj.compare();
    }
}
