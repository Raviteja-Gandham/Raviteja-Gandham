import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter Three sides of a triangle:");
		int a=sr.nextInt();
		int b=sr.nextInt();
		int c=sr.nextInt();
		
		if(a==b && b==c && c==a) // All sides are equal
		{
			System.out.println("Equilateral Triangle");
		}
		if((a==b && b!=c)||(a==c && a!=b)) // Two sides are equal
		{
			System.out.println("Isosceles Triangle");
		}
		if(a!=b && b!=c && c!=a) // All side are different
		{
			System.out.println("Scalene Triangle");
		}
		sr.close();
	}
}
