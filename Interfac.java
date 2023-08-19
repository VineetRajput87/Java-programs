interface I1
{
    void f1();
}
public class Interfac implements I1 
{
    public void f1()
    {
        System.out.println("Interfac Class");
    }
    public static void main(String arr[])
    {
        Interfac obj = new Interfac();
        obj.f1();
    }   
}
