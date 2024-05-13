/* Pragram to print Ascii value for specific character */
import java.util.Scanner;
class Ascii
{
	public static void main(String a[])
	{
		char c;
		Scanner sr=new Scanner(System.in);
		c =sr.next().charAt(0); 
		
		int ascii_value;
		ascii_value=(int)c;
		
		System.out.println(ascii_value);
	}
}
