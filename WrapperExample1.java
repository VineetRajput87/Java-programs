class WrapperExample1
{
    public static void main(String arr[])
    {
        int a=10; 
        Integer obj = Integer.valueOf(a); 
        Integer j=a;
        Integer r=obj; 
        System.out.println(a+" "+j+" "+obj+" "+r);
    }
}
