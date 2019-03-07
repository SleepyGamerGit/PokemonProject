package pokemon.model;

public class Stunfisk extends Pokemon implements Ground, Electric 
{
	public Stunfisk(int number, String name)
	{
		super(number, name);
	}
	
	public Stunfisk()
	{
		super(123, "Stunfisk");
	}
	
	public Stunfisk(String name)
	{
		super(123, name);
	}
	
	public void earthquake()
	{
		System.out.println("You shake the ground" + getAttackPoints());
	}
	
	public int mudSlap()
	{
		//change later
		return 123;
	}
	
	public void thunderBolt()
	{
		System.out.println("A good move" + getAttackPoints());
	}
	
	public void thunderField()
	{
		System.out.println("Pokemon is now stuned" + getEnhancementModifier());
	}
}
