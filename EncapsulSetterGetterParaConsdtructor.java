
public class EncapsulSetterGetterParaConsdtructor {

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
