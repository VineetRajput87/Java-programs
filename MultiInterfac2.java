interface I1
{
    void f1();
}
interface I2 extends I1
{
    void f2();
} 
interface I3 extends I2
{
    void f3();
}
public class MultiInterfac2 implements I3
{
    public void f1()
    {
        System.out.println("Interface 1st");
    }
    public void f2()
    {
        System.out.println("Interface 2nd");
    }
    public void f3()
    {
        System.out.println("Interface 3rd");
    }
     void f4()
    {
        System.out.println("Class MultiInterfac2 ");
    }
    public static void main(String arr[])
    {
        MultiInterfac2 obj = new MultiInterfac2();
        obj.f1();
        obj.f2();
        obj.f3();
        obj.f4();
    }
}
