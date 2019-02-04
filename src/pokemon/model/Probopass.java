package pokemon.model;

public class Probopass extends Pokemon implements Rock, Steel
{
	public Probopass(int number, String name)
	{
		super(number, name);
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
		System.out.println("You used a dumb move");
	}
	
	public int datOneSteelMove()
	{
		//change later
		return 156;
	}
}
