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

	public PokedexPanel(PokedexController appController)
	{
		super();
		// this.app = app;

		this.appLayout = new SpringLayout();

		this.appController = appController;

		this.pokemonIcon = new ImageIcon(getClass().getResource("/images/zelda.png"));

		numberField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -39, SpringLayout.EAST, this);
		numberField.setEditable(false);
		nameField = new JTextField("My Pokemon");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 217, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		evolveField = new JTextField("false");
		appLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, nameField);
		attackField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 5, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		enhancementField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.SOUTH, evolveField, -24, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 142, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -26, SpringLayout.EAST, this);
		healthField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -6, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);

		numberLabel = new JLabel("This pokemon number is");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, attackField);
		healthLabel = new JLabel("This pokemon health is");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -12, SpringLayout.WEST, numberField);
		evolveLabel = new JLabel("This pokemon can evolve");
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -105, SpringLayout.EAST, this);
		attackLabel = new JLabel("This pokemon  attack level is");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 185, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -47, SpringLayout.WEST, healthField);
		enhanceLabel = new JLabel("This pokemon enhancement is");
		appLayout.putConstraint(SpringLayout.SOUTH, enhanceLabel, -27, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -105, SpringLayout.EAST, this);
		nameLabel = new JLabel("My name is");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		imageLabel = new JLabel("pokemon goes here ", new ImageIcon(PokedexPanel.class.getResource("/images/pokeball.jpg")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, 42, SpringLayout.SOUTH, this);

		changeButton = new JButton("click here to change the pokevalues");
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -209, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 6, SpringLayout.SOUTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 90, SpringLayout.SOUTH, changeButton);
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
		changeButton.addActionListener(new ActionListener()
				{
					public void actionPreformed(ActionEvent click)
					{
						sendDataToController();
					}
				});
		
		pokedexDropdown.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
					{
						public void actionPer
					}
				});
	}

	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(app.isInt(attackField.getText()) && app.isDouble(enhancemnetField.getText()) && app.isInt(healthField).getText()))
		{
			String [] data = new String[5];
			
			app.updatePokemon(index,data);
		}
	}

	private void changeImageDisplay(String name)
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
}
