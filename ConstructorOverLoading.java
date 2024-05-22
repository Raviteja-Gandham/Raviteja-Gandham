
public class ConstructorOverLoading {
		
		ConstructorOverLoading()
		{
			System.out.println("hello");
		}
		
		ConstructorOverLoading(int a,int b)
		{
			System.out.println(a*b);
		}
		
		ConstructorOverLoading(int a,int b,int c)
		{
			System.out.println(a*b*c);
		}
		
		ConstructorOverLoading(int a,int b,char c)
		{
			System.out.println(a+" "+b+" "+c);
		}
		public static void main(String[] args) {
			
			ConstructorOverLoading CL=new ConstructorOverLoading();
			
			ConstructorOverLoading CL1=new ConstructorOverLoading(10,20);
			
			ConstructorOverLoading CL2=new ConstructorOverLoading(2,3,4);
			
			ConstructorOverLoading CL3=new ConstructorOverLoading(2,3,'R');
			
		
	}
}
