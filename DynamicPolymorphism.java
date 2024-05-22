class First
{
	public void m1()
	{
		System.out.println("Base Class M1 Method");
	}
	void m2()
	{
		System.out.println("Base Class M2 Method");
	}
}
class Second extends First
{
	@Override
	public void m1()  
	{ 				  
		System.out.println("Child Class M1 Method");
	}
	void m3()
	{
		System.out.println("Child class M3 Method");
	}
	
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Second s=new Second(); // Calling from child class Object
		//First s=new First(); // Calling by creating Parent class Object
		//First s=new Second(); // Calling Parent class function with the help of child class object
		//Second s=new First(); // It Through the error due to it is not possible to derive child class property to Parent class
		
		
		
		s.m1();
		s.m2();
		//s.m3();

	}

}
