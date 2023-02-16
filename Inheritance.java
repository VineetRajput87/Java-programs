class A
{
    void f1()
    {
        System.out.println("Class A");
    }   
}
class Inheritance extends A
{
    void f2()
    {
        System.out.println("Class Inheritance");
    }
    public static void main(String arr[])
    {
        Inheritance obj = new Inheritance();
        obj.f1();
        obj.f2();
    }
}
