import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int i,j,n1,n2;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter how many rows & colums : ");
		n1=sr.nextInt();
		n2=sr.nextInt();
		int Add[][]=new int[n1][n2];
		int arr[][]=new int[n1][n2];
		
		System.out.println("Enter "+n1*n2+" elements of Matrix 1: ");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				arr[i][j]=sr.nextInt();
			}
		}
		System.out.println("Enter "+n1*n2+" elements of Matrix 2: \"");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				arr[i][j]=sr.nextInt();
			}
		}
		System.out.println("Addition of 2 Matrix are : ");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				Add[i][j]=arr[i][j]+arr[i][j];
				System.out.print(Add[i][j]+" ");
			}
			System.out.println();
		} 
	
	}

}
