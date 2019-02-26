package controller;

import java.util.ArrayList;

import pokemon.model.BigYoshi;
import pokemon.model.Mimikyu;
import pokemon.model.Pokemon;
import pokemon.model.Probopass;
import pokemon.model.Stunfisk;
import pokemon.view.PokedexFrame;

public class PokedexController
{
public void start()
{
	
}

	private ArrayList<Pokemon> pokemonList;
	private pokedexFrame appFrame;
	
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Stunfisk());
		pokemonList.add(new Mimikyu());
		pokemonList.add(new BigYoshi());
		pokemonList.add(new Probopass());
	}
	
	
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	public void updatePokemon(int index, String []  data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	public String[] buildPokedexTest()
	{
		String [] names = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
}
