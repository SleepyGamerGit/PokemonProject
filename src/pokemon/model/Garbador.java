package pokemon.model;

public class Garbador extends Pokemon implements Poison
{
	public Garbador(int number, String name)
	{
		super(number, name);
	}
	
	public void toxic()
	{
		System.out.println("better version of poison: " + getEnhancementModifier());
	}
	public int sludgeBomb()
	{
		//change later
		return 136;
	}
}
