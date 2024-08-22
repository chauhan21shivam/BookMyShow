package bookmyshow;

import java.util.Scanner;

public class BookMyshow {
	Scanner sc= new Scanner(System.in);
	String emailid;
	String pwd;
	boolean login =false;
	int choice;
	String loc="";
	
	
	public void signup(){
		System.out.println("Create an account");
		System.out.println("Enter your Email id");
		emailid=sc.next();
		System.out.println("Enter your Password");
		pwd=sc.next();
		System.out.println("============================================");
	}
	
	public void login(){
		System.out.println("do you have an account ?? y/n");
		char accountexist=sc.next().charAt(0);
		
		if(accountexist=='y'||accountexist=='Y') 
		{
			System.out.println("Log in with Email");
			System.out.println("Enter your Email id");
			String confirmemailid= sc.next();
			System.out.println("Enter Password");
			String confirmpwd= sc.next();
			
		if(confirmemailid.equals(emailid) && confirmpwd.equals(pwd)) 
		{
			System.out.println("Log in Succesful");
			login=true;
			System.out.println("======================================");
		}
		else {
			System.out.println("Incorrect Password");
			login=false;
			login();
			System.out.println("======================================");
			}
		}
		else if(accountexist=='n'||accountexist=='N') 
		{
			signup();
			login();
		}
		else {
			System.out.println("Please input with Y or N");
			login();
		}
	}
	public void selection(){
		System.out.println("Enter the choice");
		System.out.println("1 for movie, 2 for comedy show, 3 for concerts");
		choice = sc.nextInt();
	}
	
	public String location(BookMyshow b){
		if(b instanceof Movies ) {
		Movies m=(Movies)b;
		System.out.println("Enter the city");
		System.out.println("Delhi, Chennai, Banglore");
		loc = sc.next();
		return loc;
	}
	else if(b instanceof Comedy)
	{
		Comedy c =(Comedy)b;
		System.out.println("Enter the Venue");
		System.out.println("Delhi, Noida, Gurgaon");
		loc = sc.next();
		return loc;
		}
	else if(b instanceof Concert)
	{
		Concert con =(Concert)b;
		System.out.println("Enter the Venue");
		System.out.println("Delhi, Noida, Gurgaon");
		loc = sc.next();
		return loc;
		}
	return loc;
	}
}


