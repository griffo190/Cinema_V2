package menu;

import java.util.Calendar;
import java.util.Scanner;

public class Film_Main {
	static Scanner scan = new Scanner(System.in);
	
	public String name;
	static int sumQuant;
	static int standard, oap, student, child, price, ticketQuantity;
	
	
	public static void filmSum(){
		
		//Declaration of total price integer
		int totalprice = 0;
		
		//This uses Java's calendar system to determine whether or not it is a Wednesday.
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		//1 = Sunday, 2 = Monday, 3 = Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday, 7 = Saturday
		//if it is a Wednesday then these are the prices
		if(day == 4)
		{
			standard = 6;
			oap = 4;
			student = 4;
			child = 2;
			//Any other day then they are 2 pound more expensive
		}else{
			
			standard = 8;
			oap = 6;
			student = 6;
			child = 4;
			
			
		}
		//Prints off how many tickets you have selected
		 sumQuant = scan.nextInt();
		 System.out.println("You have selected " + sumQuant + " ticket(s)");
		//prompts the user to select particular tickets
		 System.out.println("What type of tickets do you require:\n1. Standard - £8.00\n2. OPA - £6.00\n3. Student - £6.00\n4. Child - £4.00");	
		
		 
		 //While they're are still tickets to be chosen then the while loop is still active
		 while(sumQuant > 0){
			
			
			//If user has selected 1, 2, 3 etc then it refers to the type of ticket (OAP, student etc)
			switch(scan.next())
			{
			case "1":
				
				totalprice = totalprice + standard;
				sumQuant = sumQuant-1;
				System.out.println("You have " + sumQuant + " tickets to choose!");
				break;
			case "2":
				totalprice = totalprice + oap;
				sumQuant = sumQuant-1;
				System.out.println("You have " + sumQuant + " tickets to choose!");
				break;
			case "3":
				totalprice = totalprice + student;
				sumQuant = sumQuant-1;
				System.out.println("You have " + sumQuant + " tickets to choose!");
				break;
			case "4":
				totalprice = totalprice + child;
				sumQuant = sumQuant-1;
				System.out.println("You have " + sumQuant + " tickets to choose!");
				break;
			
			}
			
			System.out.println("total price is: £" + totalprice);
		}	
	
	}	
	
}
