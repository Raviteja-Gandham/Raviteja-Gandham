import java.util.Scanner;
public class MatrixTranspose {

	public static void main(String[] args) {
		
		int a[][]=new int[3][4];
		
		Scanner sr=new Scanner(System.in);
		
		for(int i=0;i<3;i++)  // 1st iteration
		{
			for(int j=0;j<4;j++)  // // 1st iteration
			{
				a[i][j]=sr.nextInt();  // to take input from the user
			}
		}
	//	int t[][]=new int[4][3];
		for(int j=0;j<4;j++)  // To get transpose matrix just interchange the place of i & j
		{					  // 1st You write the j loop then i loop
			for(int i=0;i<3;i++)
			{
				//t[j][i]=a[i][j];
				//System.out.print(t[j][i]+" ");
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sr.close();   // it is always good to close Scanner Object
	}

}
