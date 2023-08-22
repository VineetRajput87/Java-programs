class base
{
    void show()
    {
        System.out.println("Base class "); 
    }
}
public class Inheritance2 extends base
{
    void show()
    {
        System.out.println("Derived class");
    }
    public static void main(String arr[])
    {
        base r;
        base obj2 = new base();
        Inheritance2 obj= new Inheritance2();
        r=obj2;
        r.show();
        r=obj;
        r.show();
    }
}
