interface I1
{
    void f1();
}
interface I2
{
    void f2(); 
}
public class MultiInterfac implements I1,I2
{
    public void f1()
    {
        System.out.println("F1 Function"); 
    }
    public void f2()
    {
        System.out.println("F2 Function");
    }
    public static void main(String arr[])
    {
        MultiInterfac obj = new MultiInterfac();
        obj.f1();
        obj.f2();
    }
    
}
