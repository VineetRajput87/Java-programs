// Q.:- It is the final day of La Liga. Vineet has a certain  criteria for assessing football matches.

// In particular, he only likes a match if:

// The match ends in a draw, and,
// At least one goal has been scored by either team.
 
// Given the goals scored by both the teams as X and Y
// respectively, 
// determine whether Vineet will like the match or
// not.
 
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
		    int a,b;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    if((a>0 && b>0) && (a==b))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
