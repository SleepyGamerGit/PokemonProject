package pokemon.view;

import controller.PokedexController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
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
	private PokedexController app;

	public PokedexPanel(PokedexController app)
	{
		super();
		 this.app = app;

		this.appLayout = new SpringLayout();

		this.app = appController;

		this.pokemonIcon = new ImageIcon(getClass().getResource("/images/zelda.jpg"));

		numberField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -39, SpringLayout.EAST, this);
		numberField.setEditable(false);
		nameField = new JTextField("My Pokemon");
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		evolveField = new JTextField("false");
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, numberField);
		attackField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 5, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		enhancementField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 6, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, -58, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, numberField);
		healthField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 6, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);

		numberLabel = new JLabel("This pokemon number is");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, attackField);
		healthLabel = new JLabel("This pokemon health is");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -12, SpringLayout.WEST, numberField);
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 16, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, numberLabel);
		attackLabel = new JLabel("This pokemon  attack level is");
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, numberLabel);
		enhanceLabel = new JLabel("This pokemon enhancement is");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 13, SpringLayout.SOUTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 5, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -6, SpringLayout.WEST, enhancementField);
		nameLabel = new JLabel("My name is");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -14, SpringLayout.WEST, nameField);
		imageLabel = new JLabel("pokemon goes here ", new ImageIcon(PokedexPanel.class.getResource("/images/pokeball.jpg")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -7, SpringLayout.WEST, enhanceLabel);

		changeButton = new JButton("click here to change the pokevalues");
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -6, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, 0, SpringLayout.EAST, this);
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 30, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 79, SpringLayout.WEST, this);

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexTest());
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
		changeButton.addActionListener(new ActionListener()
				{
					public void actionPreformed(ActionEvent click)
					{
						sendDataToController();
					}
				});
		
		saveButten.addActionListener(new ActionListener()
				{
					public void actionPreformed(ActionEventClick)
					{
						app.savePokedex;
					}
				});
		
		pokedexDropdown.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
					{
						String name = pokedexDropdown.getSelectedItem().toString();
						changeImageDisplay(name);
					}	
				});
	}

	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(app.isInt(attackField.getText()) && app.isDouble(enhancementField.getText()) && app.isInt(healthField).getText()))
		{
			String [] data = new String[5];
			
			app.updatePokemon(index,data);
		}
	}
	
	public void updateFields(int index)
	{
		String [] data = app.getPokeData(index);
		
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		nameField.setText(data[3]);
		evolveField.setText(data[4]);
		numberField.setText(data[5]);
	}

/*	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
*/}
