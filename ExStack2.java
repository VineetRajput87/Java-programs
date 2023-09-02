import java.util.Scanner;
import java.util.Stack;
public class ExStack2 
{ 
    public static void main(String[] args) 
    { 
        int choice;
        Scanner sc= new Scanner(System.in);
        Stack<String> obj = new Stack<String>(); 
        do{
        System.out.println("1.Push\n2.Pop\n3.Desplay\n4.Exit\n");
        System.out.println("Enter Your Choice : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            String a;
            System.out.println("Enter a String : ");
            a=sc.next();
            obj.push(a);
        }
        else if(choice==2)
        {
            obj.pop();
        }
        else if(choice==3)
        {
            System.out.println(obj);
        }
        else if(choice==4)
        continue;
        else
        {
            System.out.println("WRONG INPUT\n PLEASE TRY AGAIN..!");
        }
    }while(choice!=4);
    }
}
