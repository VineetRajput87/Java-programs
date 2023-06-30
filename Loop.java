// WAP to take 10 integers values and desplay the result.
import java.util.Scanner;
class Loop 
{
      public static void main(String arr[ ]) 
      {
            int a,i;
            Scanner sc = new Scanner(System.in);
            for(i=1; i<=10 ; i++)
            {
                  System.out.println("Enter "+i+" Value : "); 
                  a=sc.nextInt();
                  System.out.println("The Value of "+i+" Number : "+a);
            } 
      }
}
