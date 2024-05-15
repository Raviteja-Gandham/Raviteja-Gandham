
public class Concat {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="World!";
		
		
		System.out.println(s1+" "+s2);
		
		//using concat() method
		
		String s3=s1.concat(" "+s2);
		System.out.println(s3);
		
		//using + operator
		System.out.println("Hello"+" World!");
		
	}

}
