package bookmyshow;

public class Movies extends BookMyshow{
	int amount, seatqty, popcornqty, nachosqty, cokeqty;
	String moviename, seattype, popcorntype, coketype, nachostype;
	
	public void selection() {
		
		selectMovie();
		seatselection();
		addOns();
		
		System.out.println("ENJOY WATCHING " + moviename + " Movie");
		System.out.println("Booking Details");
		System.out.println("======================================");
		System.out.println("moviename               : "+ moviename);
		System.out.println("seat type               : "+ seatqty + " * " + seattype);
		System.out.println("Popcorn               	: "+ popcornqty + " * " + popcorntype);
		System.out.println("Coke               		: "+ cokeqty + " * " + coketype);
		System.out.println("Nachos               	: "+ nachosqty + " * " + nachostype);
		System.out.println("The total Amount of Booking is "+ amount);
	}
	
	public void selectMovie() {
		
		String loc=location(new Movies());
		
		if(loc.equalsIgnoreCase("Delhi")) 
		{
			System.out.println("enter the language choice");
			System.out.println("enter 1 For english,2 for Hindi,3 For Punjabi");
			int choice = sc.nextInt();
			if(choice == 1) {
				englishMovie();
			}
			else if(choice==2) {
				hindiMovie();
			}
			else if(choice==3) {
				punjabiMovie();
			}
			else {
				System.out.println("Enter proper input");
				selectMovie();
			}
		}
		
		else if(loc.equalsIgnoreCase("Banglore")) 
		{
			System.out.println("enter the language choice");
			System.out.println("enter 1 For english,2 for Hindi, 3 for Kannada");
			int choice=sc.nextInt();
			if(choice==1) {
				englishMovie();
			}
			else if(choice==2) {
				hindiMovie();
			}
			else if(choice==3) {
				kannadaMovie();
			}
			else {
				System.out.println("Enter proper input");
				selectMovie();
			}
		} 
		
		else if(loc.equalsIgnoreCase("Chennai")) {
			System.out.println("enter the language choice");
			System.out.println("enter 1 For english,2 for Hindi, 3 for Tamil");
			int choice=sc.nextInt();
			if(choice==1) {
				englishMovie();
			}
			else if(choice==2) {
				hindiMovie();
			}
			else if(choice==3) {
				tamilMovie();
			}
			else {
				System.out.println("Enter proper input");
				selectMovie();
			}
		} 
	}
	public void seatselection() {
		System.out.println("Select Seat type");
		System.out.println("Press 1 for normal Seat 200rs");
		System.out.println("Press 2 for executive Seat 300rs");
		System.out.println("Press 3 for recliner Seat 600rs");
		int m= sc.nextInt();
		System.out.println("Enter number of seats");
		seatqty = sc.nextInt();
		
		if(m==1) {
			amount=amount+(seatqty*200);
			seattype="Normal";
		}
		else if(m==2) {
			amount=amount+(seatqty*300);
			seattype="Executive";
		}
		else if(m==3) {
			amount=amount+(seatqty*600);
			seattype="recliner";
		}
		
		else{
			System.out.println("enter correct input");
			seatselection();
		}
	} // EOF seatselection()

			public void addOns(){
				System.out.println("do you want any addons ? Y / N");
				char addon=sc.next().charAt(0);
				if(addon=='y'||addon=='Y') 
				{
				System.out.println("Do you want Popcorn ? 1 for yes & 2 for No");
				int popcorn = sc.nextInt();
				if(popcorn==1) {
					System.out.println("Press 1 for Small 200rs");
					System.out.println("Press 2 for Medium 400rs");
					System.out.println("Press 3 for Large 600");
					
					int type=sc.nextInt();
					
					System.out.println("Enter the Quantity");
					popcornqty=sc.nextInt();
					
					if(type==1) {
						amount=amount+(popcornqty*200);
						popcorntype="Small";
					}
					else if(type==2) {
						amount=amount+(popcornqty*400);
						popcorntype="Medium";
					}
					else if(type==3) {
						amount=amount+(popcornqty*600);
						popcorntype="Large";
					}
					else if(popcorn==2) {
						amount = amount;
					}
					else {
						System.out.println("enter correct input");
						addOns();
					}
				}
				
				System.out.println("Do you want Coke ? 1 for yes & 2 for No");
				int Coke=sc.nextInt();
				if(Coke ==1) {
					System.out.println("Press 1 for Small 100rs");
					System.out.println("Press 2 for Medium 200rs");
					System.out.println("Press 3 for Large 300rs");
					int type=sc.nextInt();
					System.out.println("Enter the Quantity");
					cokeqty=sc.nextInt();
					if(type==1) 
					{
						amount = amount + (cokeqty * 100);
						coketype = "Small";
					}
					else if(type==2) {
						amount = amount + (cokeqty * 200);
						coketype = "Medium";
					}
					else if(type==3) {
						amount = amount + (cokeqty * 300);
						coketype = "Large";
					}
					}
				else if(Coke==2) {
					
					amount = amount;
				}
					else {
						System.out.println("enter correct input");
						addOns();
					}
				
				System.out.println("Do you want nachos ? 1 for yes & 2 for No");
				int nachos=sc.nextInt();
				if(nachos ==1) {
					System.out.println("Press 1 for Small 70rs");
					System.out.println("Press 2 for Medium 100rs");
					System.out.println("Press 3 for Large 120");
					int type=sc.nextInt();
					System.out.println("Enter the Quantity");
					nachosqty = sc.nextInt();
					if(type==1) {
						amount += (nachosqty * 70);
						nachostype="Small";
						}
					else if(type==2) {
						amount +=(nachosqty * 100);
						nachostype="Medium";
						}
					else if(type==3) {
						amount +=(nachosqty * 120);
						nachostype="Large";
						}
					}
					else if(nachos ==2) {
					amount = amount;
					}
						else {
						System.out.println("enter correct input");
						addOns();
					 }
				}
				else {
					System.out.println("enter correct input");
				}
			}	// EOF addOns()
			
			public void englishMovie(){
				System.out.println("Select the movie");
				System.out.println("Press 1 for Fast-X");
				System.out.println("Press 2 for Barbie");
				System.out.println("Press 3 for Oppenheimer");
				int  movie = sc.nextInt();
				if(movie==1) {
				moviename = "Fast-X";
				}
				else if(movie==2) {
					moviename = "Barbie";
					}
				else if(movie==3) {
					moviename = "Oppenheimer";
					}
				else {
					System.out.println("Give Proper selection");
					englishMovie();
				}
					
				} // EOF englishMovie()
			
			public void hindiMovie() {
				System.out.println("Select the Movie");
				System.out.println("Press 1 for Jawan");
				System.out.println("Press 2 for Fukrey");
				System.out.println("Press 3 for Tiger-3");
				int  Movie = sc.nextInt();
				if(Movie==1) {
					moviename = "Jawan";
					}
				else if(Movie==2) {
					moviename = "Fukrey";
					}
				else if(Movie==3) {
					moviename = "Tiger-3";
					}
				else {
					System.out.println("Give Proper selection");
					hindiMovie();
				}
			}	// EOF hindiMovie()
			
			public void kannadaMovie() {
				System.out.println("Select the Movie");
				System.out.println("Press 1 for KGF");
				System.out.println("Press 2 for Lucia");
				System.out.println("Press 3 for Mayura");
				int  Movie = sc.nextInt();
				if(Movie==1) {
					moviename = "KGF";
					}
				else if(Movie==2) {
					moviename = "Salaar";
					}
				else if(Movie==3) {
					moviename = "Kantara";
					}
				else {
					System.out.println("Give Proper selection");
					kannadaMovie();
				}
			}	// EOF kannadaMovie()
			
			public void tamilMovie() {
				System.out.println("Select the Movie");
				System.out.println("Press 1 for Jailer");
				System.out.println("Press 2 for Leo");
				System.out.println("Press 3 for Vikram");
				int  Movie = sc.nextInt();
				if(Movie==1) {
					moviename = "Jailer";
					}
				else if(Movie==2) {
					moviename = "Leo";
					}
				else if(Movie==3) {
					moviename = "Vikram";
					}
				else {
					System.out.println("Give Proper selection");
					tamilMovie();
				}
			} // EOF tamilMovie()
			
			public void punjabiMovie() {
				System.out.println("Select the Movie");
				System.out.println("Press 1 for Jatt & juliet");
				System.out.println("Press 2 for Kishmat");
				System.out.println("Press 3 for Angrej");
				int  Movie = sc.nextInt();
				if(Movie==1) {
				System.out.println("Enjoy watching Jatt & juliet");	
				}
				else if(Movie==2) {
					System.out.println("Enjoy watching Kishmat");	
					}
				else if(Movie==3) {
					System.out.println("Enjoy watching Angrej");	
					}
				else {
					System.out.println("Give Proper selection");
					punjabiMovie();
				}
			} // EOF punjabiMovie()
	}


