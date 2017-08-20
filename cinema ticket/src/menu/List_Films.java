package menu;

public class List_Films extends Film_Main{
	
	//Array of films
	static String[] movielist = {"1. Fifty Shades Darker","2. Transformers 5","3. WonderWoman","4. Baywatch","5. The Mummy" };
	
	//Method to list the films to the console when called.
	public void ListFilms() {
		

			for (int i=0;i<movielist.length;i++)
			{
				System.out.println(movielist[i]);
			}

			
		}

	//Method to select and print chosen film.
	public static void ticketSystem()
	{
		
		int number = scan.nextInt();
		System.out.println("You have selected "+movielist[number-1].substring(3, movielist[number-1].length()));
		
		
		
	}
	

}
