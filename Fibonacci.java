import java.util.Scanner;
class Fibonacci
{
	public static void main(String ar[])
	{
		int i=0,a=1,b=1,c=1,n;//n=7;
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		//System.out.print(i+" ");
		//System.out.print(a+" ");
		//System.out.print(b+" "); or
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