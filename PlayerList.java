
import java.util.Scanner;


public class PlayerList
{
	 private int playerCount;      //total number of items in the cart
	 private final int CAPACITY;       //capacity of the team array.
	 private Player[] team;  //creates an object reference to array of Item. 
	 Scanner keyboard = new Scanner(System.in);
	 Scanner scan = new Scanner(System.in);
	 
	 //constructor that initializes the array of players.
	 PlayerList()
	 {
		   CAPACITY = 10;
		   playerCount = 0;
	   	team = new Player[CAPACITY];
	 }
	 
	 //Adds the new player to the array
	 public void addPlayer()
	 {
		 String name;
		 int score = -1;
		 playerCount++;
		 
		 System.out.println("Enter Name:");
		 name = keyboard.nextLine();
		 System.out.println("Score:");	 
	    score = scan.nextInt();
		 while(checkNegative(score))
		 {
			 System.out.println("Error-Score must be positive.Re-enter Score:");	 
		    score = scan.nextInt();
		 }
		 team[playerCount-1] = (new Player(name,score));
	 }
	 
	 //prints every player in the array
	 public void printPlayers()
	 {
		 Player rand;
		 System.out.println("\tScore\tName");
		 for(int i=0; i < playerCount; i++)
		 {
			 rand = team[i];
			 System.out.println(rand.toString());
		 }
	 }
	 
	 //searches for the player and prints his score.
	 public void lookupPlayer()
	 {
		 String look;
		 System.out.println("Enter the name to look up.");
		 look = keyboard.nextLine();
		 Player rand;
		 for(int i=0; i < playerCount; i++)
		 {
			 rand = team[i];
			 if(look.equals(rand.getname()))
			 {
				 System.out.println(look + "' score = " +rand.getscore());
				 break;
			 }
			 else if(i == playerCount-1) 
				 System.out.println("Name not found.");
		 }
	 }
	 //searches for the player and removes it
	 public void removePlayer()
	 {
		 String look;
		 System.out.println("Enter the name that you want to remove");
		 look = keyboard.nextLine();
		 Player rand;
		 for(int i=0; i < playerCount; i++)
		 {
			 rand = team[i];
			 if(look.equals(rand.getname()))
			 {
				 team[i]=team[playerCount -1];
				 team[playerCount-1]= null;
				 break;
			 }
		 }
		 System.out.println(look + " removed.");
		 playerCount--;		 
	 }

	 //checks if the input is negative.
	 public boolean checkNegative(int numberInput)
	  {
		  boolean negative = false;
		  if (numberInput < 0)
		  {
			  negative = true;
			  return negative;
		  }
		  
		  else
			  return negative;
	  }
}
