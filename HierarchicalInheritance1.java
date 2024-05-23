class ParentClass
{
	void p1()
	{
		System.out.println("Parent Class p1 method");
	}
}
class ChildClass1 extends ParentClass
{
	void c1()
	{
	System.out.println("Child1 Class c1 method");
	}
}
class ChildClass2 extends ParentClass
{
	void c1()
	{
	System.out.println("Child2 Class c1 method");
	}
}


public class HierarchicalInheritance1 {

	public static void main(String[] args) {
		
		ChildClass1 c1=new ChildClass1();
		c1.c1();
		c1.p1();
		
		ChildClass2 c2=new ChildClass2();
		c2.c1();
		c2.p1();
	}
}
