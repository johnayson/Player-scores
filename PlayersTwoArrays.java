/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: Stores and edits players with their appropriate scores
 * in an array[].
 * Due date: 10/12/2015
 * File name: PlayersTwoArrays.java
 * Assignment #5
 * Programmed by John Ayson.
 */

import java.util.Scanner;

public class PlayersTwoArrays
{
	 private int playerCount;  // total number of items in the cart
	 private final int CAPACITY;    //capacity of the scores and name array.
	 private int[] score;  //int array that stores the score
	 private String[] name;  //String array that stores the player's names.
	 Scanner keyboard = new Scanner(System.in);
	 Scanner scan = new Scanner(System.in);
	 Scanner input = new Scanner(System.in);
	 
	 //constructor that intializes capacity,playerCount and the arrays.
	 PlayersTwoArrays()
	 {
		   CAPACITY = 10;
		   playerCount = 0;
	   	score = new int[CAPACITY];
	   	name = new String[CAPACITY];
	 }
	 
	 //adds the player in its right array indexes
	 public void addPlayer()
	 {
		 String title;
		 int num;
		 playerCount++;
		 
		 System.out.println("Enter Name:");
		 title = keyboard.nextLine();
		 name[playerCount-1] = title; 
		 System.out.println("Score:");
		 num = scan.nextInt();
		 while(checkNegative(num))
		 {
			 System.out.println("Error-Score must be positive.Re-enter Score:");
			 num = scan.nextInt();
		 }
		 score[playerCount-1] = num;
	 }
	 
	 //prints the players name and their scores.
	 public void printPlayers()
	 {
		 System.out.println("\tScore\tName");
		 for(int i=0; i < playerCount; i++)
		 {
			 System.out.print("\t" + name[i]);
			 System.out.println("\t" + score[i]);
		 }
	 }
	 
	 //searches a player and give his scores.
	 public void lookupPlayer()
	 {
		 String look;
		 System.out.println("Enter the name to look up.");
		 look = keyboard.nextLine();
		 String rand;
		 int temp;
		 for(int i=0; i < playerCount; i++)
		 {
			 rand = name[i];
			 temp = score[i];
			 if(look.equals(rand))
			 {
				 System.out.println(look + "' score = " + temp);
				 break;
			 }
			 else if(i == playerCount-1) 
				 System.out.println("Name not found.");
		 }
	 }
	 
	 //removes a player from the list.
	 public void removePlayer()
	 {
		 String inp;
		 String look;
		 System.out.println("Enter the name that you want to remove");
		 look = input.nextLine();
		 for(int i=0; i < playerCount; i++)
		 {
			 inp = name[i];
			 if(look.equals(inp))
			 {
				 name[i]=name[playerCount -1];
				 name[playerCount-1]= null;
				 score[i] = score[playerCount -1];
				 score[playerCount-1] = 0;
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
