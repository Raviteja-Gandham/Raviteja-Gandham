/* Program to print Fibonacci Series */
import java.util.Scanner;
class Fibonacci
{
	public static void main(String ar[])
	{
		int i=0,a=1,b=1,c=1,n;
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		 System.out.print(i+" "+a+" "+b+" ");
		while(i<n-3)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}	
	}
}
