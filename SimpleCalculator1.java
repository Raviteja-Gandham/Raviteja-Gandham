
import java.util.Scanner;
public class SimpleCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result,oper;
		Scanner sr=new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int a= sr.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b= sr.nextInt();
		
		System.out.println("Choose Which operation do you want to perform: ");
		System.out.println("1.Addition(+)\n 2.Subtraction(-) \n 3.Multiplication(*)\n 4.Division(/)\n 5.Module(%)");
		oper = sr.nextInt();
		if(oper>=1 && oper<=4) {
		if(oper == 1)
		{
			result = a+b;
			System.out.println(result);
		}
		if(oper == 2)
		{
			result = a-b;
			System.out.println(result);
		}
		if(oper == 3)
		{
			result = a*b;
			System.out.println(result);
		}
		if(oper == 4 && b == 0)
		{
				System.out.println("Invalid User Input!");
				System.out.println("Enter valid input: ");
					b= sr.nextInt();
					while(b==0) {
						System.out.println("Enter valid input: ");
						b= sr.nextInt();
					}
		}
		if(oper==4)
					 {
				result = a/b;
				System.out.println(result);
					}
			}
		
		if(oper == 5)
		{
			result = a%b;
			System.out.println(result);
		}
		sr.close();
	}

}

