// Q.:- Vineet has a bucket having a capacity of K liters. It is already filled with X liters of water.

// Find the maximum amount of extra water in liters that Vineet
// can fill in the bucket without overflowing.

import java.util.Scanner; 

class Vineet 
{
	public static void main (String[] args)
	{
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		for(;t>0;t--)
		{
		    int a,b;
		    a=sc.nextInt(); 
		    b=sc.nextInt();
		    System.out.println(a-b);
		}
	}
}
