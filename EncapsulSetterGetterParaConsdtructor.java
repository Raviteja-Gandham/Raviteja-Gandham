
public class EncapsulSetterGetterParaConsdtructor {

	// 1.Right click on any variable
	// 2.Select option (source)
	// 3.click on (Generate constructor using Fields) option
	// 4.click on (getters) Option
	// 5.and click on Generate
		private String name;   
		private int age;
		
	public EncapsulSetterGetterParaConsdtructor(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		EncapsulSetterGetterParaConsdtructor ep=new EncapsulSetterGetterParaConsdtructor("Raviteja", 21);
		EncapsulSetterGetterParaConsdtructor ep1=new EncapsulSetterGetterParaConsdtructor("Ravi", 22);
		
		System.out.println(ep.getName()+" "+ep.getAge());
		System.out.println(ep1.getName()+" "+ep1.getAge());
	}

}
