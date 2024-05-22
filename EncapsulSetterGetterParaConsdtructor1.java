
public class EncapsulSetterGetterParaConsdtructor1 {
		
	private static int id;
	private static String name;
	private static int salary;

	public EncapsulSetterGetterParaConsdtructor1(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public static void main(String[] args) {

		EncapsulSetterGetterParaConsdtructor1 ep=new EncapsulSetterGetterParaConsdtructor1(81,85000,"Raviteja");
		System.out.println("Id  : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Salary  : "+salary);
	}

}
