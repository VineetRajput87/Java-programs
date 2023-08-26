import java.util.Scanner;
class GreaterNumber
{ 
    int a,b;
    void compare()
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        a=sc.nextInt();
        System.out.println("Enter Value of B : ");
        b=sc.nextInt();
        if(a>b)
           System.out.println("Greater Value is : "+a); 
        else if(b>a)
           System.out.println("Greater Value is : "+b);
        else
           System.out.println("Both values are Equal");
    }
    
    public static void main(String[] args) 
    {
        GreaterNumber obj = new GreaterNumber();
        obj.compare();
    }
}
