// Q.:- Vineet considers the climate HOT if the temperature is above 20, otherwise he considers it COLD. You are given the temperature C, find whether the climate is HOT or COLD.

import java.util.Scanner;

class Vineet
{
	public static void main (String[] args)
	{
		int t,a;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		for(;t>0;t--)
		{
		    a=sc.nextInt();
		    if(a>20)
		    System.out.println("HOT");
		    else
		    System.out.println("COLD");
		}
	}
}
