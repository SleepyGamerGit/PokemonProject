package pokemon.model;

public class Probopass extends Pokemon implements Rock, Steel
{
	public Probopass()
	{
		super(3212, "Probopass");
	}
	
	public Probopass(String name)
	{
		super(3212, name);
	}
	
	public Probopass(int num, String name)
	{
		super(num, name);
	}
	
	public void rockTomb()
	{
		System.out.println("opponets pokemom get coverd in rocks: " + getAttackPoints());
	}
	
	public int rockSmash()
	{
		return this.getAttackPoints(); 	
	}
	
	public void harden()
	{
		System.out.println("You used a dumb move: " + getEnhancementModifier());
	}
	
	public int datOneSteelMove()
	{
		//change later
		return 156;
	}
}
