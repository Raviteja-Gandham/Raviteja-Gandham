import java.util.Scanner;
public class StringConacat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1,s2,s3;
		Scanner sr=new Scanner(System.in);
		s1 = sr.nextLine();
		s2 = sr.nextLine();
		
		s3 = s1.concat(" "+s2);
		System.out.println(s3);
		
		s1=s1.concat(s2);
		System.out.println(s1);
		
		
		sr.close();
	}

}
