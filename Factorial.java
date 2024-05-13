/* Program to print Factorial of a specific number */
import java.util.Scanner;
class Factorial
{
	public static void main(String ar[])
	{
		int fact=1,n;
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		while(n!=0)
		{
			fact*=n;
			n--;
		}
		System.out.println("Factorial of is "+fact);
	}
}
