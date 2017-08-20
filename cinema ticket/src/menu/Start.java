package menu;

import java.util.*;

public class Start {

	//Declaration of variables
	static Scanner scan = new Scanner(System.in);
	public static String user;
	//To help determine what to do when the user is faced with a menu choice (Exit or view films)
	public static int menuItem = -1;
	public static int quantity;
	
	
	
	public static void main(String[] args) {
		
//Instructing the user to input their name along with other things as the program progresses.
		System.out.println("Welcome to your automatic Ticket ordering system, Please enter your Name: ");
		getUser();
		System.out.println("Hello " + user + " Select a function: " + "\n" + "1. Film List" + "\n" + "2. Exit");
		menuSystem();
		System.out.println("" +user + ", Please select the film you wish to purchase tickets for.");
		List_Films.ticketSystem();
		System.out.println("How many tickets do you require " + user + "?");
		List_Films.filmSum();
		
		
	
	}
	
	//Methods to help organise split code and make it cleaner and more understandable
	public static void getUser()
	{
		user = scan.nextLine();
		
	}
	
	public static void menuSystem()
	{
		
		menuItem = scan.nextInt();
		if(menuItem == 1){
			
			listFilms();
		}else if(menuItem == 2)
		{
			System.out.println("Bye Bye, You have chosen to exit!");
			System.exit(0);
		}
			
	}

	public static void listFilms(){
		
		List_Films list = new List_Films();
		
		list.ListFilms();
		
	}

}

