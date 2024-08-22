package bookmyshow;

public class Concert extends BookMyshow {
    int amount, seatqty, popcornqty, nachosqty, cokeqty, whiskyQty;
    String concertName, seattype, popcorntype, coketype, nachostype, whiskyType;

    public void selection() {
        selectConcert();
        seatselection();
        addOns();

        System.out.println("ENJOY ATTENDING " + concertName + " Concert");
        System.out.println("Booking Details");
        System.out.println("======================================");
        System.out.println("Concert Name            : " + concertName);
        System.out.println("Seat Type               : " + seatqty + " * " + seattype);
        System.out.println("Popcorn                 : " + popcornqty + " * " + popcorntype);
        System.out.println("Coke                    : " + cokeqty + " * " + coketype);
        System.out.println("Whisky                  : " + whiskyQty + " * " + whiskyType);
        System.out.println("Total Amount of Booking: " + amount);
    }

    public void selectConcert() {
        String loc = location(new Concert());

        if (loc.equalsIgnoreCase("Delhi")) {
            System.out.println("Select the concert in Delhi");
            System.out.println("Press 1 for RockFest, 2 for Jazz Night, 3 for Pop Fusion");
            int choice = sc.nextInt();

            if (choice == 1) {
                concertName = "RockFest";
            } else if (choice == 2) {
                concertName = "Jazz Night";
            } else if (choice == 3) {
                concertName = "Pop Fusion";
            } else {
                System.out.println("Enter proper input");
                selectConcert();
            }
        } else if (loc.equalsIgnoreCase("Noida")) {
            System.out.println("Select the concert in Noida");
            System.out.println("Press 1 for EDM Extravaganza, 2 for Classical Symphony, 3 for Hip-Hop Beats");
            int choice = sc.nextInt();

            if (choice == 1) {
                concertName = "EDM Extravaganza";
            } else if (choice == 2) {
                concertName = "Classical Symphony";
            } else if (choice == 3) {
                concertName = "Hip-Hop Beats";
            } else {
                System.out.println("Enter proper input");
                selectConcert();
            }
        } else if (loc.equalsIgnoreCase("Gurgaon")) {
            System.out.println("Select the concert in Gurgaon");
            System.out.println("Press 1 for Country Jamboree, 2 for R&B Groove, 3 for Sufi Soul");
            int choice = sc.nextInt();

            if (choice == 1) {
                concertName = "Country Jamboree";
            } else if (choice == 2) {
                concertName = "R&B Groove";
            } else if (choice == 3) {
                concertName = "Sufi Soul";
            } else {
                System.out.println("Enter proper input");
                selectConcert();
            }
        } else {
            System.out.println("Invalid location");
            selectConcert();
        }
    }


    public void seatselection() {
        System.out.println("Select Seat type");
        System.out.println("Press 1 for Regular Seat 1000rs");
        System.out.println("Press 2 for VIP Seat 2000rs");
        System.out.println("Press 3 for Premium Seat 3000rs");
        
        int seatTypeChoice = sc.nextInt();

        System.out.println("Enter number of seats");
        seatqty = sc.nextInt();

        switch (seatTypeChoice) {
            case 1:
                amount = amount + (seatqty * 1000);
                seattype = "Regular";
                break;
            case 2:
                amount = amount + (seatqty * 2000);
                seattype = "VIP";
                break;
            case 3:
                amount = amount + (seatqty * 3000);
                seattype = "Premium";
                break;
            default:
                System.out.println("Invalid seat type choice. Please enter correct input.");
                seatselection();
                break;
        }
    }
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

