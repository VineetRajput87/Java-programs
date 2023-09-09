//import java.util.Scanner;
public class Employee 
{
    int Id,salary;
    String firstname,lastname; 

    Employee(int Id,int salary,String firstname, String lastname)
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter First Name : ");
        this.firstname=firstname;
       // System.out.print("Enter Last Name : ");
        this.lastname=lastname;
       // System.out.print("Enter  ID : ");
        this.Id=Id;
       // System.out.print("Enter Salary :");
        this.salary=salary;
    }
    int getID()
    {
        return Id;
    }
    void getFirstName()
    {
        System.out.println("The First Name is : "+firstname);
    }
    void getLastName()
    {
        System.out.println("The Last Name is : "+lastname);
    }
    void getName()
    {
        System.out.println("Name is : "+firstname+" "+lastname);
    }
    void getSalary()
    {
        System.out.println("The Salary is : "+salary);
    }
    void setSalary(int salary)
    {
        
    }
    void getAnnualSalary()
    {
        System.out.println("The Annual Salary is : "+(salary*12));
    }
    int raiseSalary(int persent)
    {
        int raised;
        raised=((salary*persent)/100)+salary;
        return raised;
    }
    public static void main(String[] args) 
    {
        Employee obj =new Employee(181,5000,"Vineet","Rajput");
        System.out.println("The Raised Salary is : "+obj.getID()); 
        obj.getFirstName();
        obj.getLastName();
        obj.getName();
        obj.getSalary();
        obj.setSalary(5000);
        obj.getAnnualSalary();
        System.out.println("The Raised Salary is : "+obj.raiseSalary(10)); 
    }
}
