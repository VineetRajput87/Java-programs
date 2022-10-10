/*Q.12: define a class compute with overloaded method : 

void add method, 
int add(int, int), 
double(double, double, double)

Impliment this program in java.*/

class Boxarea 
{    
    int l;
    int b;
    int h;
    
    void vol(int i, int j , int k )
    {
        l=i;
        b=j;
        h=k;
    System.out.println(l*b*h);    
    }
     public static void main ( String a[])
     {
        Boxarea obj = new Boxarea();
        obj.vol(10, 20, 30);
     }
}