/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: Driver class for PlayerList and PlayersTwoArrays.
 * Due date: 10/12/2015
 * File name: ScoresManagementSystem.java
 * Assignment #5
 * Programmed by John Ayson.
 */
import java.util.Scanner;

public class ScoreManagementSystem
{
	public static void main(String[] args)
	{
		Scanner input;
      PlayersTwoArrays scores = new PlayersTwoArrays();
      PlayerList highScores = new PlayerList();
      input = new Scanner(System.in);
		String choice = "";

		// Main menu for PlayerList class.
		do
		{
			System.out.println();
			System.out.println();
			System.out.println("Score Management System");
			System.out.println("Choose:");
			System.out.println();
			System.out.println("A)dd new player");
			System.out.println("P)rint all players");
			System.out.println("L)ookup a player's score");
			System.out.println("R)emove a player");
			System.out.println("Q)uit");
			System.out.println();
			choice = input.next();
		   input.nextLine(); // Discard newline
			
         if (choice.equalsIgnoreCase("A"))
				highScores.addPlayer();
			else if (choice.equalsIgnoreCase("P"))
				highScores.printPlayers();
			else if (choice.equalsIgnoreCase("L"))
				highScores.lookupPlayer();
			else if (choice.equalsIgnoreCase("R"))
				highScores.removePlayer();
			System.out.println();
         
		} while (!choice.equalsIgnoreCase("q"));
		
		//Main menu for PlayerTwoArrays class.
		do
		{
			System.out.println();
			System.out.println();
			System.out.println("Score Management System(extra credit)");
			System.out.println("Choose:");
			System.out.println();
			System.out.println("A)dd new player");
			System.out.println("P)rint all players");
			System.out.println("L)ookup a player's score");
			System.out.println("R)emove a player");
			System.out.println("Q)uit");
			System.out.println();
			choice = input.next();
		   input.nextLine(); // Discard newline
			
         if (choice.equalsIgnoreCase("A"))
				scores.addPlayer();
			else if (choice.equalsIgnoreCase("P"))
				scores.printPlayers();
			else if (choice.equalsIgnoreCase("L"))
				scores.lookupPlayer();
			else if (choice.equalsIgnoreCase("R"))
				scores.removePlayer();
			System.out.println();
         
		} while (!choice.equalsIgnoreCase("q"));
	}
}