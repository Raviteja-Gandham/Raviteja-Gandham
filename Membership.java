import java.util.Scanner;
public class Membership {

	public static void main(String[] args) {
		
		//boolean status = true;
		
		//String status = "premium";
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter Membership status: ");
		String status=sr.nextLine();
		
		System.out.println("Enter Purchased amount: ");
		int purchase=sr.nextInt();
		
		if(status.equalsIgnoreCase("premium"))
		{
			System.out.println("Premium member");
			
			if(purchase>=1000)
			{
				double discount=purchase*0.20;
				double amt=purchase-discount;
				System.out.println("Total Amount: "+amt);
			}
			else {
				double amt=purchase;
				System.out.println("Total Amount: "+amt);
			}
		}
		if(status.equalsIgnoreCase("non-premium")) {
			if(purchase>=2000)
			{
				double discount=purchase*0.15;
				double amt=purchase-discount;
				System.out.println("Total Amount: "+amt);
			}
			else {
				double amt=purchase;
				System.out.println("Total Amount: "+amt);
			}
		}
		sr.close();
	}

}
