class base 
{
    base()
    {
        System.out.println("Constructor of base Class ");
    } 
    void show()
    {
        System.out.println("The Base class Method");
    }

}
public class ExSuperKeyword2 extends base
{

    void show()
    {
        super.show();
        System.out.println("The Derived Class Method");
    }
    public static void main(String arr[])
    {
        ExSuperKeyword2 obj = new ExSuperKeyword2();
        obj.show();
    }
    
}
