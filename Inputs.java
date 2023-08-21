//Q. :- WAP in java to take 4 input 1st as int , 2nd as float , double and string and desplay the result of all of them.

import java.util.Scanner;
class Inputs 
{
    public static void main(String arr[ ])
    {
          int a;
          float b;
          double c; 
          String d;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter value of A : ");
          a=sc.nextInt();
          System.out.println("Enter value of B : ");
          b=sc.nextFloat();
          System.out.println("Enter value of C : ");
          c=sc.nextDouble();
          System.out.println("Enter value of D : "); 
          d=sc.next();
          System.out.println("A : "+e+ "\nB : "+b+"\nC : "+c+"\nD : "+d);
    }
}
