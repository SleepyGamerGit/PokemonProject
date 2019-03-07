package pokemon.model;

public class Garbador extends Pokemon implements Poison
{
	public Garbador(int number, String name)
	{
		super(number, name);
	}
	
	public Garbador()
	{
		super(422, "Garbador");
	}
	
	public Garbador(String name)
	{
		super(422, name);
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
