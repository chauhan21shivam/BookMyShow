package bookmyshow;

public class Comedy extends BookMyshow{
	int amount, seatqty, popcornqty, nachosqty, cokeqty, whiskyQty;
    String showName, seattype, popcorntype, coketype, nachostype, whiskyType;

	public void selection() {
		
		selectShow();
		seatselection();
		addOns();
		
		System.out.println("ENJOY WATCHING " + showName + " Comedy Show");
        System.out.println("Booking Details");
        System.out.println("======================================");
        System.out.println("Show Name               : " + showName);
        System.out.println("Seat Type               : " + seatqty + " * " + seattype);
        System.out.println("Popcorn                 : " + popcornqty + " * " + popcorntype);
        System.out.println("Coke                    : " + cokeqty + " * " + coketype);
        System.out.println("Whisky                  : " + whiskyQty + " * " + whiskyType);
        System.out.println("Total Amount of Booking: " + amount);
   }
	
	public void selectShow() {
        String loc = location(new Comedy());

        if (loc.equalsIgnoreCase("Delhi")) {
            System.out.println("Enter the choice");
            System.out.println("Enter 1 For Bassi Show, 2 for Gaurav Show, 3 For Akash Gupta Show");
            int choice = sc.nextInt();
            if (choice == 1) {
                showName = "Bassi";
            } else if (choice == 2) {
                showName = "Gaurav";
            } else if (choice == 3) {
                showName = "Akash Gupta";
            } else {
                System.out.println("Enter proper input");
                selectShow();
            }
        } else if (loc.equalsIgnoreCase("Noida")) {
            System.out.println("Enter the choice");
            System.out.println("Enter 1 For Munawar Show, 2 for Zakir Show");
            int choice = sc.nextInt();
            if (choice == 1) {
                showName = "Munawar";
            } else if (choice == 2) {
                showName = "Zakir ";
            } else {
                System.out.println("Enter proper input");
                selectShow();
            }
        } else if (loc.equalsIgnoreCase("Gurgaon")) {
            System.out.println("Enter the choice");
            System.out.println("Enter 1 For Bhuwan Show, 2 for RohitRajput Show, 3 for Harsh Gujral Show");
            int choice = sc.nextInt();
            if (choice == 1) {
                showName = "Bhuwan";
            } else if (choice == 2) {
                showName = "RohitRajput";
            } else if (choice == 3) {
                showName = "Harsh Gujral";
            } else {
                System.out.println("Enter proper input");
                selectShow();
            }
        }
    }

	public void seatselection() {
		System.out.println("Select Seat type");
		System.out.println("Press 1 for normal Seat 200rs");
		System.out.println("Press 2 for executive Seat 300rs");
		System.out.println("Press 3 for vip Seat 600rs");
		int m= sc.nextInt();
		
		System.out.println("Enter number of seats");
		seatqty = sc.nextInt();
		
		if(m==1) {
			amount=amount+(seatqty*999);
			seattype="Normal";
		}
		else if(m==2) {
			amount=amount+(seatqty*1500);
			seattype="Executive";
		}
		else if(m==3) {
			amount=amount+(seatqty*2000);
			seattype="Vip";
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
				
				System.out.println("Do you want Whishky ? 1 for yes & 2 for No");
				int whisky=sc.nextInt();
				
				if(whisky ==1) {
					System.out.println("Select whishky type");
					
					System.out.println("Press 1 for Johnnie Walker 3000rs");
					System.out.println("Press 2 for Evan Williams 6000rs");
					System.out.println("Press 3 for Jameson 9000rs");
					int type=sc.nextInt();
					
					System.out.println("Enter the Quantity");
					whiskyQty=sc.nextInt();
					
					if(type==1) 
					{
						amount = amount + (whiskyQty * 3000);
						whiskyType = "Johnnie Walker";
					}
					else if(type==2) {
						amount = amount + (whiskyQty * 6000);
						whiskyType = "Evan Williams";
					}
					else if(type==3) {
						amount = amount + (whiskyQty * 9000);
						whiskyType = "Jameson";
					}
					}
				else if(whisky==2) {
					
					amount = amount;
				}
					else {
						System.out.println("enter correct input");
						addOns();
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
				}
			}
			
}


