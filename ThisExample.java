public class ThisExample 
{
    int a; 
    int b;
    ThisExample()
    { 
        this(100);
        System.out.println("Heyy..!");
    }
    ThisExample(int a)
    {
        System.out.println(a);
    }
    void welcome()
    {
        System.out.println("Wellcome to the program..!");
    }
    void show()
    {
        this.welcome();
        int a=2;
        int b=4;
        this.a=20;
        this.b=30;
        System.out.println("Addition of Locals : "+(a+b)+"\nThe Instance A and B : "+this.a+" "+this.b);
    }
    public static void main(String arr[])
    {
        ThisExample obj = new ThisExample();
        obj.show();
    }

}
