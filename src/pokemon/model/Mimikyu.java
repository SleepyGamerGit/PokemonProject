package pokemon.model;

public class Mimikyu extends Pokemon implements Ghost
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
}
