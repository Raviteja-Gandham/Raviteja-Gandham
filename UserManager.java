
public class UserManager {

	String user_Name = "Raviteja";
	String pass_word = "Ravi@21";
	int user_Pin=2001;
	String phn_Num = "9876543210";
	String email_Id ="raviteja2@gmail.com";
	
	void authentication(String userName, String password)   //Function Over Loading with 2 parameters 
	{
		if(user_Name == userName && pass_word == password)  
		{
			System.out.println("Athorized User");
		}
		else
		{
			System.out.println("Unathorized User");
		}
		//System.out.println(userName+" "+password);
	}
	void authentication(String email,String password,int pin)  //Function Over Loading with 3 parameters
	{
		if(email_Id == email && pass_word == password && user_Pin == pin)
		{
			System.out.println("Authorized User");
		}
		else
		{
			System.out.println("Unauthorized User");
		}
		//System.out.println(email+" "+password+" "+pin);
	}
	void authentication(String phn , int pin) 	//Function Over Loading with 2 parameters
	{
		if(phn_Num == phn && user_Pin == pin)
		{
			System.out.println("Authorized User");
		}
		else
		{
			System.out.println("Unauthorized User");
		}
		//System.out.println(phn+" "+pin);
	}
	
	public static void main(String[] args) {
	
		UserManager um=new UserManager();
	
		um.authentication("Raviteja", "Ravi@21");
		
		um.authentication("raviteja2@gmail.com", "Ravi@21", 2001);
		
		um.authentication("9876543210", 2001); 
	}

}
