package pokemon.view;

import controller.PokedexController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokedexPanel extends JPanel
{
	private PokedexController  appController;
	private SpringLayout appLayout;
	private JComboBox<String> pokedexDropdown;
	private JButton changeButton;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		
		numberField = new JTextField("0");
		numberField.setEditable(false);
		nameField = new JTextField("My Pokemon");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon  attack level is");
		enhanceLabel = new JLabel("This pokemon enhancement is");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("pokemon goes here");
		
		changeButton = new JButton("click here to change the pokevalues");
		pokedexDropdown = new JComboBox<String>();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		
		this.add(numberLabel);
		this.add(healthLabel);
		this.add(evolveLabel);
		this.add(enhanceLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(imageLabel);
		this.add(changeButton);
		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
