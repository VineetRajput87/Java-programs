import java.util.Scanner;
class Arrayinput
{
    public static void main(String arr[ ])
    {
        int a[ ]= new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<10;i++)
        {
                System.out.println("Enter values : ");       
                a[i]=sc.nextInt();  
        }
      for(i=0; i<10;i++)
{  
System.out.println(a[i]);  
}
    }
}
