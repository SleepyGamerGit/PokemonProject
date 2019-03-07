package controller;


import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.model.*;
import pokemon.view.PokedexFrame;

public class PokedexController
{
public void start()
{
	
}

	private String saveFile = "backup.pokemon";
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	
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
	
	public void savePokedex()
	{
		try
		{
			FileOutputStrean saveStream = new FileOuptuStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
		}
		catch(IOExection error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOExeption error)
		{
			JOptionPane.showMessageDialog(appFrame, "No Save file", "leading Pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (ClassNotFoundException pokemonError)
		{
			JOptionPane.showMessageDialog(appFrame, pokemonError.getMessage(), "Type Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	public String [] getPokeData(int index)
	{
		String [] data = new String [6];
		Pokemon current = pokemonList.get(index);
		data[0] = current.getAttackPoints() + "";
		data[1] = current.getEnhancementModifier() + "";
		data[2] = current.getHealthPoints() + "";
		data[3] = current.getName() + "";
		data[4] = current.isCanEvolve() + "";
		data[5] = current.getNumber() + "";
		return data;
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
