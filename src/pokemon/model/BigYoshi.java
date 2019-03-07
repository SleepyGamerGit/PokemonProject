package pokemon.model;

public class BigYoshi extends Pokemon implements Ground
{
	public BigYoshi()
	{
		super(9999, "Big Yoshi");
	}
	
	public BigYoshi(String name)
	{
		super(9999, name);
	}
	
	public BigYoshi(int num, String name)
	{
		super(num, name);
	}

	public void earthquake()
	{
		
	}
	
	public int mudSlap()
	{
		return 0;
	}
	
	
}
