class First
{
	public void m1()//protected void m1() // public void m1()
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
	@Override // it is for Recognition to know others to know it is overriden from parent
	public void m1()  // Override is possible through public -->public ; protected --> protected ; protected --> public
					  // Overridden is possible => datatypes must be same; void-->void ; int-->int ;float-->float etc..
	{ 				  // Override is not possible through private -->private ; private-->protected ; private-->Public ; protected--> private ; public -->private ; public --> protected
					  // // Overridden is not possible => one datatypes to another datatype ;ex:-void-->int ; int-->void ;float-->int ;int-->float etc..
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
		//Second s=(Second) new First(); // to resolve the above problem of line 33 we use this statement. By using this we can SKIP Compile Time error
		
		
		s.m1();
		s.m2();
		//s.m3();

	}

}
