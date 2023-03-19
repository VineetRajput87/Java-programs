class Base
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class Child extends Base
{
    void show()
    {
        System.out.println("Child Class\n");
    }
    public static void main(String[] args) 
    {
        Base r;
        Base ob = new Base();
        Child obj = new Child();
        
        r=ob;
        r.show();
        r=obj;
        r.show();
    }
}
