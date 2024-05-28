import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
				
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter Length and Breadth of the Rectangle:");
		double len=sr.nextInt();
		double bre=sr.nextInt();
		
		double area = len*bre;  //To calculate Area of the rectangle
		System.out.println(area);
	}

}
