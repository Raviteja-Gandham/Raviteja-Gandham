import java.util.Scanner;
class MenuBeverages4
{
	public static void main(String ar[])
	{
		int choice;
		int select;
		double n_Coffees,n_Tea,n_Buscuit,n_Samosa,sum=0,total=0;
		int coffee=15,tea=12,buscuit=5,samosa=15;
		System.out.println(".........Welcome to Star Cafe.......");
		Scanner sr=new Scanner(System.in);
		System.out.println("Menu Driven :\n 0.Exit\n 1.Coffee\n 2.Tea \n 3.Buscuit \n 4.Samosa");
		System.out.print("Enter Your Choice: ");
		choice=sr.nextInt();
		while(choice!=0)
		{
			
		if(choice>=1 && choice<=4)
			{
			if(choice==1)
			{
				System.out.print("How many coffee's do you want : ");
				n_Coffees=sr.nextInt();
				n_Coffees=n_Coffees*15;
				System.out.println("Coffee Bill : "+n_Coffees);
				sum+=n_Coffees;
				
			}
			
			
		else if(choice==2)
		{
			System.out.print("How many Tea's do you want : ");
			n_Tea=sr.nextInt();
			n_Tea=n_Tea*12;
			System.out.println("Tea Bill : "+n_Tea);
			sum+=n_Tea;
			
		}
		else if(choice==3)
		{
			System.out.print("How many Buscuit's do you want : ");
			n_Buscuit=sr.nextInt();
			n_Buscuit=n_Buscuit*5;
			System.out.println("Buscuit Bill : "+n_Buscuit);
			sum+=n_Buscuit;
			
		}
		else if(choice==4)
		{
			System.out.print("How many Samosa's do you want : ");
			n_Samosa=sr.nextInt();
			n_Samosa=n_Samosa*15;
			System.out.println("Samosa Bill : "+n_Samosa);
			sum+=n_Samosa;
			
		}
		
		
			System.out.println("Any Thing else : 1.Yes or 2.No ");
			select=sr.nextInt();
			if(select==1)
			{
				System.out.println("Menu Driven :\n 0.Exit\n 1.Coffee\n 2.Tea \n 3.Buscuit \n 4.Samosa");
				choice=sr.nextInt();
			}
			else if(select==2)
			{
				System.out.println("Total Bill : "+sum);
				System.out.println(".......Thank You visit Again....");	
				break;
			}
			
			else
			{
				System.out.println("Please! Enter valid Input");
				System.out.println("Any Thing else : 1.Yes or 2.No ");
				select=sr.nextInt();
			if(select==1)
			{
				System.out.println("Menu Driven :\n 0.Exit\n 1.Coffee\n 2.Tea \n 3.Buscuit \n 4.Samosa");
				choice=sr.nextInt();
			}
			else if(select==2)
			{
				System.out.println("Total Bill : "+sum);
				System.out.println(".......Thank You visit Again....");
				break;
			}
		}
	}
		
  }
}
