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
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		//this.app = app;
		
		this.appLayout = new SpringLayout();
		
		this.appController = appController;
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/images/zelda.png"));
		
		numberField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -39, SpringLayout.EAST, this);
		numberField.setEditable(false);
		nameField = new JTextField("My Pokemon");
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		enhancementField = new JTextField("0");
	 	healthField = new JTextField("0");
	 	appLayout.putConstraint(SpringLayout.NORTH, nameField, 11, SpringLayout.SOUTH, healthField);
	 	appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, enhancementField);
		
		numberLabel = new JLabel("This pokemon number is");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, numberLabel);
		healthLabel = new JLabel("This pokemon health is");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 27, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, numberLabel);
		attackLabel = new JLabel("This pokemon  attack level is");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 185, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, numberLabel);
		enhanceLabel = new JLabel("This pokemon enhancement is");
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, -22, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 32, SpringLayout.EAST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, -34, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -95, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -105, SpringLayout.EAST, this);
		nameLabel = new JLabel("My name is");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		imageLabel = new JLabel("pokemon goes here ", pokemonIcon, JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 5, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 10, SpringLayout.WEST, this);
		
		changeButton = new JButton("click here to change the pokevalues");
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 45, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 48, SpringLayout.WEST, this);
		
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
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
