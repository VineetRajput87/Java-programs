interface I1
{
    void f1(); 
}
abstract class A implements I1
{
    abstract void f2();
    public void f1()
    {
        System.out.println("Interface I1");
    }
}
public class abstracinterfac extends A
{
    void f2()
    {
        System.out.println("Abstract Class");
    }
    void f3()
    {
        System.out.println("Class main");
    }
    public static void main(String arr[])
    {
        abstracinterfac obj = new abstracinterfac();
        obj.f1();
        obj.f2();
        obj.f3();
    }
}
