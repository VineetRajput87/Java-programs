import java.util.Scanner;
public class Student
{
    String name ;
    int age;
    float cgpa;

    void getData()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name =sc.next(); 
        System.out.print("Age : ");
        age=sc.nextInt();
        System.out.print("CGPA : ");
        cgpa=sc.nextFloat();
    }   
    void showData()
    {

        System.out.println("Name : "+name);
        System.out.println("AGE : "+age);
        System.out.println("CGPA : "+cgpa);
    }
    public static void main(String arr[])
    {
        int i,num;
        Student obj[] = new Student[10];
        
        System.out.print("Number Of Student : ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(i=0;i<num;i++)
        {
            obj[i]=new Student();
        }
        for(i=0; i<num; i++)
        {
            System.out.println("Take The Data of Student : "+(i+1));
            obj[i].getData();
        }
        for(i=0; i<num; i++)
        {
            System.out.println("Showing Data of Student : "+(i+1));
            obj[i].showData();
        }
    }
}
