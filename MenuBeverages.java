import java.util.Scanner;
class MenuBeverages
{
	public static void main(String ar[])
	{
		int choice;
		int coffee=15,Tea=12,Buscuit=5,Samosa=15;
		System.out.println(".........Welcome to Star Cafe.......");
		System.out.println("Menu Driven :\n 1.Coffee\n 2.Tea \n 3.Buscuit \n 4.Samosa");
		Scanner sr=new Scanner(System.in);
		System.out.print("Enter Your Choice: ");
		choice=sr.nextInt();
		if(choice==1)
		{
			System.out.print("How many coffee's ♨☕ do you want : ");
			double N_Coffees=sr.nextInt();
			N_Coffees=N_Coffees*15;
			System.out.println("Total Bill : "+N_Coffees);
		}
		if(choice==2)
		{
			System.out.print("How many Tea's do you want : ");
			double N_Tea=sr.nextInt();
			N_Tea=N_Tea*12;
			System.out.println("Total Bill : "+N_Tea);
		}
		if(choice==3)
		{
			System.out.print("How many Buscuit's do you want : ");
			double N_Buscuit=sr.nextInt();
			N_Buscuit=Buscuit*5;
			System.out.println("Total Bill : "+N_Buscuit);
		}
		if(choice==4)
		{
			System.out.print("How many coffee's do you want : ");
			double N_Samosa=sr.nextInt();
			N_Samosa=N_Samosa*15;
			System.out.println("Total Bill : "+N_Samosa);
		}
	}
}
