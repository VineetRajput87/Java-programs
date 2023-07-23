import java.util.Scanner;
class Student 
{    
    String Name;
    int Age;
    float CGPA;
 
    void getdata()
    {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Geting Student Data : ");
        System.out.println();
        System.out.println("Name : ");
        Name=sc.next(); 
        System.out.println("Age : ");
        Age=sc.nextInt();
        System.out.println("CGPA : ");
        CGPA=sc.nextFloat();
        System.out.println();
    }

    void showdata()
    {
        System.out.println("Showing Student Data : ");
        System.out.println();
        System.out.println("Name : "+Name);
        System.out.println("Name : "+Age);
        System.out.println("Name : "+CGPA);
    }    
       

     public static void main ( String a[])
     {
        Student obj = new Student();
        obj.getdata();
        obj.showdata();
     }
}
