import java.util.Scanner;
class Add
{
    int a;
    int b;
    
    public static void main(String[] args)
    {
        Add obj = new Add();
        System.out.println("Enter the value of A and B : ");
        Scanner sc = new Scanner(System.in);
        obj.a=sc.nextInt();
        obj.b=sc.nextInt();
        System.out.println(obj.a+obj.b);
    }
}
