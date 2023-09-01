class ABC
{
    int a; 
    int b;
    ABC(int b)
    {
        System.out.println("Welcome with the number : "+b);
    }
    void show()
    {
        a=10;
        b=20;
        System.out.println("Class A");
        System.out.println("The Addition of A and B : "+(a+b));
    }

}
class ExSuperKeyWord extends ABC
{
    void subclass()
    {
        System.out.println("Sub Class");
        super.show();   
    }
    ExSuperKeyWord()
    { 
        super(2);
    }
    public static void main(String arr[])
    {
        ExSuperKeyWord obj = new ExSuperKeyWord();
        obj.subclass();
    }
}
