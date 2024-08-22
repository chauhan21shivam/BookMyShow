package bookmyshow;

public class Bookmyshowuser {
public static void main(String[] args) {
	BookMyshow b= new BookMyshow();
	b.login();
	if(b.login==true) 
	{
		b.selection();
		if(b.choice==1) 
		{
			b = new Movies(); //upcasting
			b.selection();
		}
		if(b.choice==2) 
		{
			b = new Comedy(); //upcasting
			b.selection();
		}
		if(b.choice==3) 
		{
			b = new Concert(); //upcasting
			b.selection();
		}
	}
}
}
