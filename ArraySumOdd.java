/*Q: Create Array of n elements ,Sum only positive odd numbers*/
import java.util.Scanner;
public class ArraySumOdd {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int sum=0;
		System.out.println("How many elements do you eant to enter: ");
		int n=sr.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sr.nextInt();  //input array of elements from the user
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)   // when given number is above the zero then only allow the element 
			{
				if(a[i]%2==1)  // after division the remainder is equal to 1 then execute this block 
					sum=sum+a[i];
			}
		}System.out.println("Sum of Positive Odd Numbers is: "+sum);
	}

}
