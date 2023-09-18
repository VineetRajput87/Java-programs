/*Q.12: define a class compute with overloaded method : 

void add method, 
int add(int, int),  
double(double, double, double)

Impliment this program in java.*/
import java.util.Scanner; 
class Boxarea 
{    
    int l;
    int b;
    int h;

     public static void main ( String a[])
     {
        Boxarea obj = new Boxarea();
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the values of l, b, and h : ");
        obj.l=sc.nextInt();
        obj.b=sc.nextInt();
        obj.h=sc.nextInt();
        System.out.println("The area of Box is : "+(obj.l*obj.b*obj.h));
     }
}
