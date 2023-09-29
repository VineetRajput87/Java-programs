interface I1
{
    void show(); 
}
class c1 implements I1
{
    public void show()
    {
        System.out.println("Class C1");
    }
}
class c2 implements I1
{
    public void show()
    {
        System.out.println("Class C2"); 
    }
}
public class Assinment implements I1
{
    public void show()
    {
        System.out.println("Class Assignment");
    }
    public static void main(String arr[]) 
    {
        c1 ob1 = new c1();
        c2 ob2 = new c2();
        Assinment ob3 = new Assinment();
        ob1.show();
        ob2.show();
        ob3.show();
    }   
}
