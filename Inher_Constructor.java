class SuperClass
{
	SuperClass() // Super class Constructor
	{
		System.out.println("Super Class");
	}
	void sc1()
	{
		System.out.println("Super Class sc1");
	}
	void sc2()
	{
		System.out.println("Super Class sc2");
	}
	void sc3()
	{
		System.out.println("Super Class sc3");
	}
}
class SubClass extends SuperClass
{
	SubClass()  // Child Constructor
	{
		// super();//Implicit call to SuperClass Constructor
		System.out.println("Sub Class");
	}
	@Override  // Override from parent class
	void sc1()
	{
		System.out.println("Sub Class sb1");
	}
	void sb2()
	{
		System.out.println("Sub Class sb2");
		super.sc2();  // To call Parent class method : Calling through super keyword
	}
}
class Inher_Constructor
{
	public static void main(String[] args) {
		
		SubClass sc=new SubClass();
		
		sc.sc1(); 
		sc.sb2();
		sc.sc3(); // calling through object

	}

}
