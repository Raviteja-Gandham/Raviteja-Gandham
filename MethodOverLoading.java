
public class MethodOverLoading {

	//Polymorphism
	
	//1.No.of parameter 2. type of parameter 3.sequence of parameter
	public void show(int a)
		{
			System.out.println(a);
		}
		
		public void display(int a,int b)
		{
			System.out.println(a+b);
		}
		
		public void hello(float a,int b)
		{
			System.out.println(a*b);
		}
		public void greet(char a, int b)
		{
			System.out.println(a+" "+b);
		}
	public static void main(String[] args) {

		MethodOverLoading ML=new MethodOverLoading();
		
		ML.show(10);
		ML.display(10, 20);
		ML.hello(22.5f, 20);
		ML.greet('R', 100);
		
	}

}
