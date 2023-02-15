import java.util.Scanner;
class Array2D
{
     public static void main(String ar[ ])
     {
          int a[ ][ ] = new int[2][2];
          int i,j;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter values : ");
          for(i=0;i<2;i++)
          {
             for(j=0;j<2;j++)
             {
                  
                  a[i][j]=sc.nextInt();
             }
           System.out.println();      
          }
          for(i=0;i<2;i++)
          {
             for(j=0;j<2;j++)
             {
                  System.out.print(" "+a[i][j]);
             }
            System.out.println();     
          }       

     }
}