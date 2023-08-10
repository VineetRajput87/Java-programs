public class Referance 
{
    int A=10;
      public static void main(String sr[])
      { 
        Referance r; 
        Referance obj = new Referance(); 
        r=obj;
        System.out.println("The value of A : "+r.A);
      } 
}
