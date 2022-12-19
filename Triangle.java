import java.util.Scanner;
class Rectangle
{
    int l,b;
    void getrect()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and Width : ");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    void showrect()
    {
        System.out.println("Rectangle's Area is : "+(l*b));
    }
}
class Triangle extends Rectangle
{
    void showtrin()
    {
        System.out.println("Triangle's Area is : "+(0.5*l*b));
    }
    public static void main(String[] args) 
    {
        Triangle obj = new Triangle();
        obj.getrect();
        obj.showrect();
        obj.showtrin();
        System.out.println("\n       hello");
    }
}