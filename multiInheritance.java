class A
{
    void f1()
    {
        System.out.println("Class A"); 
    }
}

class B extends A
{
    void f2()
    {
        System.out.println("Class B");
    }
}
public class multiInheritance extends B
{
    void f3()
    {
        System.out.println("Class MultiInheritance");
    }
    public static void main(String arr[])
    {
        multiInheritance obj = new multiInheritance();
        A ob = new A();
        ob.f1();
        obj.f1();
    }
}
