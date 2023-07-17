abstract class ABC 
{
    abstract void f1();
    void f2()
    {
        System.out.println("F2 Function");
    }
}
class B extends ABC  
{
    void f1()
    {
        System.out.println("Class B");
    }
}
public class abstrac extends ABC
{
    void f1()
    {
        System.out.println("Class Abstrac");
    }
    public static void main(String arr[])
    {
        ABC r;
        B ob = new B();
        abstrac obj = new abstrac();
        r=obj;
        r.f1();
        r.f2();
        r=ob;
        r.f1();
    }
}
