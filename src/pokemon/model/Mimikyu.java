package pokemon.model;

public class Mimikyu extends Pokemon implements Ghost, Fariy
{
	public Mimikyu(int number, String name)
	{
		super(number, name);
	}
	
	public void shadowBall()
	{
		System.out.println("You make a gaint ball of darkness:" + getAttackPoints());
	}
	
	public int shadowClaw()
	{
		//change later
		return 156;
	}
	
	public void moonblast()
	{
		System.out.println("Praise the moon: " + getAttackPoints());
	}
	
	public int cuteness()
	{
		//change later
		return 1895;
	}
}
