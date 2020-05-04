

public class Player
{
	private String name;  //keeps the players name
	private int score;  //keeps the players score
	
	//default constructor
	Player()
	{}
	
	//constructor that initializes the name and score. 
	Player(String title, int num)
	{
		name = title;
		score = num;
	}
	
   //sets the player's name	
	public void setname(String nam)
	{
		name = nam;
	}
	
	//sets the player's score
	public void setscore(int num)
	{
		score = num;
	}
	
	//fetches the player's name
	public String getname()
	{
		return name;
	}
	
	//fetches the player's scire
	public int getscore()
	{
		return score;
	}

	//prints the score and name
	public String toString()
	{
		String contents;
		contents = "\t" + score + "\t" + name;
		return contents;
	}
}
