
import java.util.Scanner;
public class MovieTicketBooking {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=sr.nextInt();
		System.out.println("Note:please enter 24hr time\neg:for 2pm enter 14 for 11am enter 11 and so on..\nEnter your Time slot of the movie:");
		int slot=sr.nextInt();
		
		if((age<=5 || age>=60)&&(slot>=1 && slot<=24))
		{
			System.out.println("get a free ticket");
		}
		else if((age>=6 || age<=59)&&(slot>=11 && slot<=14)) //To Book Matinee movie
		{
			System.out.println("Matinee Price is 250/-");
		}
		else if((age>=6 || age<=59)&&(slot>=17 && slot<=21))
		{
			System.out.println("First Show Price is 300/-"); //Too Book First Show movie
		}
		else
		{
			System.out.println("Price is 200/-"); //To Book Morning and Second show movie
		}
		sr.close();
	}

}
