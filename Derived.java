import java.util.Scanner;
class Base
{
    String name;
    int age; 
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name=sc.next();
        System.out.println("Age : ");
        age=sc.nextInt();
    }
    void showData()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        
    }
}
public class Derived extends Base
{
    String email;
    void getEid()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Email : ");
        email=sc.next();
    }
    void showEid()
    {
        System.out.println("Email Id : "+email);
    }
    public static void main(String arr[])
    {
        Derived obj = new Derived();
        System.out.println("Getting The Data Of Student ");
        obj.getData();
        obj.getEid();
        System.out.println("Showing the Data Of Student ");
        obj.showData();
        obj.showEid();
    }
}
