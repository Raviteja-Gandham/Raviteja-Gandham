class A
{
	private void a1()
	{
		System.out.println("Class A1");
	}
	protected void a2()
	{
		System.out.println("Class A2");
	}
	public void a3()
	{
		System.out.println("Class A3");
	}
}
class B extends A
{
	void b1()
	{
		System.out.println("class B1");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {

		B b=new B();
		//b.a1();  // private specifiers are not allowed to access 
		b.b1();
		b.a2();
		b.a3();

	}

}
